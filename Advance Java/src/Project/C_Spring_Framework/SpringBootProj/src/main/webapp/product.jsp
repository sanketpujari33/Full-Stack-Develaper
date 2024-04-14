<!-- Example form with CSS styles and icon -->
<!DOCTYPE html>
<html>
<head>
    <title>Add Product Form</title>
    <style>
        /* CSS styles for the form */
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            text-align: center;
            margin: 0;
            padding: 0;
        }
        .form-container {
            margin-top: 50px;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 50%;
            margin-left: auto;
            margin-right: auto;
        }
        input[type="text"] {
            width: 100%;
            padding: 8px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }
        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
        /* CSS for the icon */
        .icon {
            display: inline-block;
            width: 20px;
            height: 20px;
            background-image: url('https://via.placeholder.com/20'); /* Replace with your icon URL */
            background-size: cover;
            margin-right: 5px;
            vertical-align: middle;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <form action="addProduct" method="get">
            <div class="icon"></div> <!-- Icon placeholder -->
            Product Id <input type="text" name="pid" /><br>
            Product Name <input type="text" name="pname" /><br>
            Product Price <input type="text" name="price" /><br>
            <input type="submit" value="Add Product" />
        </form>
    </div>
</body>
</html>
