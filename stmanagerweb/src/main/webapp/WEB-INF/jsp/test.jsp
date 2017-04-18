<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
    <body>
    <script src="<%=basePath%>js/jquery-1.12.2.js"></script>
        <script>

            function one()
            {
                var question=
                 {
                     content: "question1",
                     url:"http:test.wwww",
                     type:1,
                     upId:"user1",
                     fromId:"test15"
                 };
                var choice=
                    [{
                        content: "choice1",
                        url:"http:wwww.image1",
                        type:1
                    },
                        {
                            content: "choice2",
                            url:"http:wwww.image2",
                            type:2
                        },
                        {
                            content: "choice3",
                            url:"http:wwww.image3",
                            type:3
                        }];
                 $.ajax({
                type:"POST",
                url:"qi/addQuestion",
                dataType: "json",
                data:{
                       "params":JSON.stringify(question),
                       "choice":JSON.stringify(choice)
                      }
            });
            }
        </script>

    <p onclick="one()"><font color="red" size="23">点击</font></p>
    </body>
</html>
