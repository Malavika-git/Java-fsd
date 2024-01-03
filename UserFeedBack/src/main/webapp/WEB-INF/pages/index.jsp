<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<html>
<head>
    <title>Feedback Form</title>
</head>
<body>
<h1>FeedBackForm</h1>
<f:form modelAttribute="feed1" action="feedback">
             <div class="form-group">
                <label for="name">Your Name:</label>
                <f:input path="name" class="form-control" required="true"/>
            </div>


           

<div class="form-group">
                <label for="email">Your Email:</label>
                <f:input path="email" class="form-control" required="true"/>
            </div>
           
<div class="form-group">
                <label for="rating">Your Rating:</label>
                <f:input path="rating" class="form-control" required="true"/>
            </div>
           
           
<div class="form-group">
                <label for="comment">Your Comment:</label>
                <f:input path="comment" class="form-control" required="true"/>
            </div>
           
            <button type="submit">Submit Feedback</button>
        </f:form>
   
        
    </form>
</body>
</html>