<h1>Let's count!</h1>

<%! int count;%>

<%
    ++count;
%>

<h2>You've been here for <%=count%> times.</h2>
<h2>And your result is: ${result} </h2>

<form action="/servlet/calculator">

    <div>
        Input the opeariton you want to do (add, sub, mul, div):
        <input type="text" id="operation" width="20" name="operation" value=""/>
    </div>
    <br/>
    <div>
        Input the first operand:
        <input type="text" id="operand1" width="20" name="operand1" value=""/>
    </div>
    <br/>
    <div>
        Input the second operand:
        <input type="text" id="operand2" width="20" name="operand2" value=""/>
    </div>
    <br/>
    <div>
        <input type="submit"/>
    </div>

</form>

