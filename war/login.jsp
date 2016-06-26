<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<%@ taglib prefix="h" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="nested" uri="http://struts.apache.org/tags-nested"%>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>INVITTE.ME</title>
    </head>

    <body onLoad="document.f.j_username.focus();">
    <table width="89%" border="0" align="center" cellpadding="20" cellspacing="0">
      <tr class="body">
        <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td><table width="100%" border="0" cellspacing="0" cellpadding="20">
              <tr>
                <td class="topo-logo"><p>&nbsp;</p>
                <p>&nbsp;</p>
                <p>&nbsp;</p></td>
                <td valign="top">
                  <br></td>
              </tr>
            </table></td>
          </tr>
          <tr class="central">
            <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td><form name="f" action="j_spring_security_check" method="POST"><table width="400" border="0" align="center" cellpadding="0" cellspacing="0">
                  <tr>
                    <td align="center" valign="middle">
                      <label for="textfield2">Usuario: </label><br>
                      <input type="text" name="j_username" id="j_username" class="input-especial">
                     </td>
                    </tr>
                  <tr>
                    <td align="center">
                        <label for="textfield2">Senha: </label><br>
                        <input type="password" name="j_password" id="j_password" class="input-especial"></td>
                    </tr>
                  <tr>
                    <td align="center"><p><sup>
                      <input type="checkbox" name="radio">
                      Lembrar-me
                      
                      </sup></p></td>
                    </tr>
                  <tr>
                    <td align="center"><input name="button" type="submit" id="submit" value="Entrar" class="botton-especial">
                      <br>
                      <sup>Esqueceu sua senha?</sup><br></td>
                    </tr>
                </table></form></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
              </tr>
            </table></td>
          </tr>
          <tr>
            <td>&nbsp;</td>
          </tr>
        </table></td>
      </tr>
    </table>
    <table width="600" align="center" border="0" cellpadding="8" cellspacing="0">
      <tbody>
        <tr class="texto-rodape">
          <td width="150"><a href="http://sonagg.r2s.biz/fadfa">InvitteMe © 2011</a></td>
          <td width="150"><a href="http://sonagg.r2s.biz/adfa">Termos de uso</a></td>
          <td width="150"><a href="http://sonagg.r2s.biz/fasdfa">Privacidade</a></td>
          <td width="150"><a href="http://sonagg.r2s.biz/adfad">Sobre</a></td>
        </tr>
      </tbody>
    </table>
    <p>&nbsp;</p>
    </body>
</html>
