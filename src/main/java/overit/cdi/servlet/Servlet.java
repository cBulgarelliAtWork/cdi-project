package overit.cdi.servlet;

import org.apache.commons.lang3.StringUtils;
import overit.cdi.services.ServiceA;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet("/myServlet")
public class Servlet extends HttpServlet {

    @Inject
    private ServiceA serviceA;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        calculate(req);
        req.getRequestDispatcher("/main.jsp").forward(req, resp);
    }

    private void calculate(HttpServletRequest req) {
        try {
            String name = Optional.ofNullable(req.getParameter("name"))
                    .filter(StringUtils::isNotEmpty)
                    .orElseThrow(() -> new RuntimeException("Name is required!"));
            Integer age = Optional.ofNullable(req.getParameter("age"))
                    .filter(StringUtils::isNotEmpty)
                    .map(Integer::valueOf)
                    .orElseThrow(() -> new RuntimeException("Age is required!"));
            req.setAttribute("message", serviceA.helloUser(name, age));
        } catch (RuntimeException ex) {
            req.setAttribute("message", ex.getMessage());
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        calculate(req);
        req.getRequestDispatcher("/main.jsp").forward(req, resp);
    }
}
