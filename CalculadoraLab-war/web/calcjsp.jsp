<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!-- <br> es el salto de linea -->
        <h1>Ingrese los numeros</h1>
        <form action="calcservlet" method="POST">
            
            <input type="text" name="v1"  />
            <br>
            <input type="button" value="1" onClick="v1.value+='1'">
            <input type="button" value="2" onClick="v1.value+='2'">
            <input type="button" value="3" onClick="v1.value+='3'">
            <input type="button" value="+" onClick="v1.value+='+'">
            <input type="button" value="%" onClick="v1.value+='%'">
            <br>
            <input type="button" value="4" onClick="v1.value+='4'">
            <input type="button" value="5" onClick="v1.value+='5'">
            <input type="button" value="6" onClick="v1.value+='6'">
            <input type="button" value="-" onClick="v1.value+='-'">
            <input type="button" value="^" onClick="v1.value+='^'">
            <br>
            <input type="button" value="7" onClick="v1.value+='7'">
            <input type="button" value="8" onClick="v1.value+='8'">
            <input type="button" value="9" onClick="v1.value+='9'">
            <input type="button" value="*" onClick="v1.value+='*'">
            <br>
            <input type="button" value="0" onClick="v1.value+='0'">
            <input type="reset" value="c">
            <input type="button" value="/" onClick="v1.value+='/'">
            
            <!--<input type="button" value="=" onClick="v1.value = eval(v1.value)">-->
            <input type="submit" value="OK" />
            
            <!--
            <input type="text" name="v2"  />
            <select name="v3">
                <option>suma</option>
                <option>resta</option>
                <option>multiplicacion</option>
                <option>division</option>
                <option>modulo</option>
                <option>potencia</option>
            </select>
              
            <input type="submit" value="OK" />
            -->

        </form>
    </body>
</html>
