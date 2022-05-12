<!DOCTYPE html>
<%@ page session="false" %>
<html lang="en" class="h-100">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>CDI project</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css">
    </head>

    <body class="d-flex flex-column h-100">
        <nav class="navbar navbar-light bg-light mb-3">
            <div class="w-100 d-flex px-3 align-items-center">
                <div class="flex-fill">
                    <a class="navbar-brand" href="#">
                        <%=request.getAttribute("message") != null ? request.getAttribute("message") : "" %>
                    </a>
                </div>
            </div>
        </nav>
        <form method="post" class="m-0" action="myServlet">
            <div class="container-fluid flex-fill d-flex flex-column">
                <div class="container-fluid">
                    <div class="row mb-3">
                        <div class="col-sm-6">
                            <label for="name">Name</label>
                            <input type="text" class="form-control" id="name" name="name" placeholder="your name" value="<%=request.getParameterMap().containsKey("name") ? request.getParameter("name") : ""%>"/>
                        </div>
                        <div class="col-sm-6">
                            <label for="age">Age</label>
                            <input type="text" class="form-control" id="age" name="age" placeholder="your age" value="<%=request.getParameterMap().containsKey("age") ? request.getParameter("age") : ""%>"/>
                        </div>
                    </div>

                    <div class="input-group mb-3">
                        <input type="submit" value="Go"/>
                    </div>
                </div>
            </div>
        </form>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>

    </html>