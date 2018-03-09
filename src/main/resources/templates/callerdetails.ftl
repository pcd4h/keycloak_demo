<#import "/spring.ftl" as spring>
<html>
<h1>Caller Details</h1>
<ul>
<#list callerdetails as detail>
    <li>${detail}</li>
</#list>
</ul>
<p>
    <a href="/logout">Logout</a>
</p>
</html>