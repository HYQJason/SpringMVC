<%@ page import="static java.lang.System.out" %><%--
  Created by IntelliJ IDEA.
  User: wangyao3
  Date: 2018/11/12
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<input type="text" value="请输入"  id="ipt">


<body>


<button onclick="mClick()"> 搜索</button>

<p onclick="aaa()">${data} </p>
<%
    //代码片段，语句、变量、
    int a = 100;
    String name = "2224658";
%>

<jsp:scriptlet>



              //代码片段，语句、变量、



</jsp:scriptlet>

<script type="text/javascript">
    //标签用于定义客户端脚本
    //在 HTML 页面中插入一段 JavaScript
    //元素既可以包含脚本语句，也可以通过 src 属性指向外部脚本文件。
    //javascript代码，语句、变量、
    //let var const
    function aaa() {
        console.log("aaaaaaaaaaaaaaaaa")
    }

</script>


<%!
    //代码片段，语句、变量、方法
    int b;

    public void myclick() {
        out.print("点击事件触发=================");

    }


%>

<script>

    function mClick() { // 方法
     var text=  document.getElementById('ipt').value;
        /*        使用 window.alert() 弹出警告框。
        使用 document.write() 方法将内容写到 HTML 文档中。
        使用 innerHTML 写入到 HTML 元素。
        使用 console.log() 写入到浏览器的控制台。*/
        console.log("aaaaaaaaaaaaaaaaa");





    }



</script>
</body>


</html>
