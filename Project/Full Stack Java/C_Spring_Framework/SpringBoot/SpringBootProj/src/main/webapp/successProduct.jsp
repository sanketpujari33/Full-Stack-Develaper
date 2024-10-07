<!-- successProduct.jsp -->

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <title>Product Added Successfully</title>
        <style>
            /* CSS styles for the success page */
            body {
                font-family: Arial, sans-serif;
                background-color: #d4edda;
                color: #155724;
                text-align: center;
                margin: 0;
                padding: 0;
            }

            .container {
                margin-top: 50px;
                padding: 20px;
                border: 1px solid #c3e6cb;
                border-radius: 5px;
                background-color: #fff;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
                width: 50%;
                margin-left: auto;
                margin-right: auto;
            }

            h1 {
                color: #155724;
            }

            p {
                color: #155724;
                font-size: 18px;
            }
        </style>
    </head>

    <body>
        <div class="container">
            <h1>Product Added Successfully</h1>
            <p>The product has been added to the system.</p>
            <p><a href="product.jsp">Add New Product</a></p>
            <!-- You can include additional content or links as needed -->
        </div>
    </body>

    </html>