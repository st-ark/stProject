<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/13
  Time: 18:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<script src="../js/jquery.js"></script>
<script>
//    var infoJson = {
//        content: 'concon',
//        url: 'http://www.url.com',
//        type: '0',
//        questionId: 'timu1',
//        userId: 'user1'
//    };
//    var skillArr = [{skillId: 'sdfsd'}, {skillId: 'sfd'}];
//    var resArr = [{resId: 'aas'}, {resId: 'ryee'}];
//    $.ajax({
//        url: "http://localhost:8080" + "/answer/add",
//        type: "post",
//        dataType: "json",
//        data: {
//            "info": JSON.stringify(infoJson),
//            "skill": JSON.stringify(skillArr),
//            "resource": JSON.stringify(resArr)
//        },
//        success: function (result) {
//            console.log(result);
//        },
//        error: function () {
//            console.log("error");
//        }
//    })

    var infoJson = {
        resId : "res1",
        title: "title1",
        type: 0,
        knowledgeId : 3,
        upId: "user1"
    };
    var dataArr = [{content:"cincin1",type:0},{content:"cioncin2",type:0}];
    $.ajax({
        url: "http://localhost:8080" + "/resource/add",
        type: "post",
        dataType: "json",
        data: {
            "info": JSON.stringify(infoJson),
            "data": JSON.stringify(dataArr)
        },
        success: function (result) {
            console.log(result);
        },
        error: function () {
            console.log("error");
        }
    })
</script>
</body>
</html>