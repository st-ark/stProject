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
    <script src="../js/jquery.js"></script>
        <script>

            function one()
            {
              /*添加 题目
               var question=
                 {
                     content: "content1",
                     url:"http:update.wwww",
                     type:3,
                     upId:"user1",
                     fromId:"test16",
                     questionId:"8ef71fde-c50f-4100-912d-4b962fbd77be"
                 };
                var choice=
                    [{
                        choiceId:"1c7c938c-b2c8-4f14-831e-b5c97820778a",
                        content: "updatechoice1",
                        url:"http:update.image1",
                        type:1
                    },
                        {
                            choiceId:"2c895e6a-f199-4603-83e6-aecaf7d3b1ad",
                            content: "updatechoice2",
                            url:"http:update.image2",
                            type:2
                        },
                        {
                            choiceId:"3cc8aa79-60ff-4f20-a377-6cd81b051488",
                            content: "choice3",
                            url:"http:update.image3",
                            type:3
                        }];*/

              /* 修改思路*/
              var info={
                  upId:"user1",
                  solveId:"solve1",
                  content:"updateContent1",
                  questionId:"timu1"
              };
             var array=[{
                  knowledgeId:11,
                  knowledgeCheck:12,
                  eyeIdOld:"eye2",
                  eyeId:"eye2",
                  eyeCheck:13,
                  trapId:"sdfdfdfsdfsdfId4",
                  trapCheck:11,
                  formulaId:"djhjghjh",
                  formulaCheck:15
              },
                  {
                      knowledgeId:3,
                      knowledgeCheck:23,
                      eyeIdOld:"eye3",
                      eyeId:"test23333333",
                      eyeCheck:23,
                      trapId:"hjghjhhgjgh",
                      trapCheck:32,
                      formulaId:"ghjghjgh",
                      formulaCheck:23
                  }
              ];
                 $.ajax({
                type:"POST",
                url:"qsc/updateSolve",
                dataType: "json",
                data:{
                       "solve":JSON.stringify(info),
                       "solveCon":JSON.stringify(array)
                      },
                     success: function (result) {
                         console.log(result);
                     }
            });
            }
        </script>

    <p onclick="one()"><font color="red" size="23">点击</font></p>
    </body>
</html>
