<%@page contentType="text/html; charset=UTF-8" %>
<%@page import="java.util.ArrayList" %>
<%@page import="java.time.LocalDate" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>bbs.jsp</title>
    <link rel="icon" href="img/WEBpage.png">
    <link rel="stylesheet" href="css/bbs.css">
</head>
<body>
    <header>
        <div id="navi_header">
            <a href="index.html" class="navi_m">jecBBS</a>
            <span>></span>　掲示板
            <a href="bbs.jsp" class="navi_b">　掲示板</a>
            <a href="post.html" class="navi_p">　投稿</a>
            <a href="delete" class="navi_d">　削除</a>
        </div>
    </header>
    <main id="mainpart">
        <br>
        <%
        LocalDate data = LocalDate.now();
        ArrayList<String> namelist = (ArrayList<String>) application.getAttribute("name");
        ArrayList<String> comlist = (ArrayList<String>) application.getAttribute("comment");
        ArrayList<String> colorlist = (ArrayList<String>) application.getAttribute("color");
    
        if(namelist != null && comlist != null && colorlist != null){
        for(int i = 0; i < colorlist.size();i++){
                out.println( "[" + (i+1) + "]");
                out.println(namelist.get(i));
                %><br><br><%
                out.print("<div style='color:" + colorlist.get(i) + ";'>" + comlist.get(i) + "</div>");                
                %><br><br><%
                out.println(data);
                %><br><br><%
                out.println("-----------------------------------------------------------------------");
                %><br><%
            }
        } else {
            %><br><%
            out.println("投稿がありません。");
        }
        %>
        <p><a href="index.html">戻る</a></p>
    </main>
    <footer>
        <p id="copyright"><small>
            Copyright &copy; 2025 Liu YuRung(24CA0243), All rights reserved.
        </small></p>
    </footer>
    
    
</body>
</html>