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
    var infoJson = {
        content: 'concon',
        url: 'http://www.url.com',
        type: '0',
        questionId: 'timu2',
        userId: 'user1'
    };
    var skillArr = [{skillId: 'sdsd'}, {skillId: 'sfd'}];
    var resArr = [{resId: 'aas'}, {resId: 'ryee'}];
    $.ajax({
        url: "http://localhost:8080" + "/answer/add",
        type: "post",
        dataType: "json",
        data: {
            "info": JSON.stringify(infoJson),
            "skill": JSON.stringify(skillArr),
            "res": JSON.stringify(resArr)
        },
        success: function (result) {
            console.log(result);
        },
        error: function () {
            console.log("error");
        }
    })

//    var infoJson = {
//        name:"etetre",
//        content: "ewrdsds",
//        difficulty: 0,
//        type : 3,
//        upId: "user1",
//        count:10
//    };
//    var dataArr = [{questionId:"questi"},{questionId:"questi"}];
//    $.ajax({
//        url: "http://localhost:8080" + "/package/delete",
//        type: "post",
//        dataType: "json",
//        data: {
//            "packageId":"ce745fa1-899d-4dab-a280-78fdd583da66"
//        },
//        success: function (result) {
//            console.log(result);
//        },
//        error: function () {
//            console.log("error");
//        }
//    })


</script>
</body>
</html>