<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>请求参数传递和接收问题</title>
    
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="this is my page">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
  </head>
  
  <body>
  <h3>GET方式提交</h3>
    <form action="/day09/demo5" method="GET">
        用户名：<input type="text" name="name"/><br/>
        密码：<input type="password" name="password"/><br/>
        性别：
        <input type="radio" name="gender" value="男"/>男
        <input type="radio" name="gender" value="女"/>女<br/>
        籍贯：
            <select name="jiguan">
                <option value="广东">广东</option>
                <option value="广西">广西</option>
                <option value="湖南">湖南</option>
            </select>
            <br/>
        爱好：
        <input type="checkbox" name="habit" value="篮球"/>篮球
        <input type="checkbox" name="habit" value="足球"/>足球
        <input type="checkbox" name="habit" value="羽毛球"/>羽毛球<br/>
        个人简介：
        <textarea rows="5" cols="10" name="info"></textarea><br/>
        <!-- 隐藏域 -->
        <input type="hidden" name="id" value="001"/>
        <input type="submit" value="提交"/>
    </form>
    <hr/>
    
    <h3>POST方式提交</h3>
    <form action="/day09/demo5" method="POST">
        用户名：<input type="text" name="name"/><br/>
        密码：<input type="password" name="password"/><br/>
        性别：
        <input type="radio" name="gender" value="男"/>男
        <input type="radio" name="gender" value="女"/>女<br/>
        籍贯：
            <select name="jiguan">
                <option value="广东">广东</option>
                <option value="广西">广西</option>
                <option value="湖南">湖南</option>
            </select>
            <br/>
        爱好：
        <input type="checkbox" name="hobit" value="篮球"/>篮球
        <input type="checkbox" name="hobit" value="足球"/>足球
        <input type="checkbox" name="hobit" value="羽毛球"/>羽毛球<br/>
        个人简介：
        <textarea rows="5" cols="10" name="info"></textarea><br/>
        <!-- 隐藏域 -->
        <input type="hidden" name="id" value="001"/>
        <input type="submit" value="提交"/>
    </form>
  </body>
</html>