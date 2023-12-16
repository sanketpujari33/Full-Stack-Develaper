<jsp:useBean id="book" class="mypack.Book" scope="session"/>
<!DOCTYPE html>
<html>
<head>
    <title>Book List</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }

        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: left;
        }

        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h2>Book List</h2>
    <table>
        <thead>
            <tr>
                <th>Book No.</th>
                <th>Name</th>
                <th>Price</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td><jsp:getProperty property="bno" name="book"/></td>
                <td><jsp:getProperty property="bname" name="book"/></td>
                <td><jsp:getProperty property="price" name="book"/></td>
            </tr>
            <!-- Add more rows for additional books -->
        </tbody>
    </table>
</body>
</html>
