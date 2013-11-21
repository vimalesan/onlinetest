<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
		<form name="examForm" action="process-answer" method="get" commandName="questionForm">
			<br><br>			
			<table>
				<tr>
					<td colspan="2" width="600"><font color="megenta" size="6">Online Test</font></td>
				</tr>
				<tr align="center">
					<td><c:if test="${error != null}">
						<font color="red" size="5">${error}</font>
					</c:if>	
					</td>
				</tr>						
				<tr>
					<td >						
							<input type="hidden" name="id" id="id" value="${question.id}"/>
							<h2>Q.${question.id} ${question.question}</h2>
							<input type="radio" name="option" value="${question.option1}">
							<b><c:out value="${question.option1}"/></b><br>
							<input type="radio" name="option" value="${question.option2}">
							<b><c:out value="${question.option2}"/></b><br>
							<input type="radio" name="option" value="${question.option3}">
							<b><c:out value="${question.option3}"/></b><br>
							<input type="radio" name="option" value="${question.option4}">
							<b><c:out value="${question.option4}"/></b><br><br>							
					</td>
					<tr align="center">
						<td>
							<c:if test="${opt.id > 0}">
								<input type="submit" value="Answer"/>
							</c:if>
						</td>
					</tr>
				</tr>			
			</table>
		
				<input type="button" value="Next Question" id="nextquestion"/>
				<input type="button" value="Result" onClick="javascript:window.location ='show-result'"/>
</form>