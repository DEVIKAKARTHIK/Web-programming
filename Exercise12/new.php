<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        h1 {
            text-align: center;
        }
        table{
            width: 300px;
            border-collapse: collapse;
            margin: 0 auto;
        }
        td ,th {
            padding-block: 0.5rem;
            padding-inline: 1rem;
        }
    </style>
</head>
<body >
    <h1>mark list</h1>
    <table border='1'>
        <tr><th colspan="2">Series Test1</th></tr>
        <tr>
            <td>Name</td>
            <td><?php echo $_POST['name'];?></td>
        </tr>
        <tr>
            <td>Age:</td>
            <td><?php echo $_POST['age'];?></td>
        </tr>
        <tr><th colspan="2">Marks</th></tr>
       <tr>
            <td>CS:</td>
           <td><?php echo $_POST['csmark'];?></td>
       </tr>
       <tr>
            <td>English</td>
            <td><?php echo $_POST['englishmark'];?></td>
       </tr>
         <tr>
            <td>Maths</td>
            <td><?php echo $_POST['mathsmark'];?></td>
       </tr>
       <tr>
            <td>Web</td>
            <td><?php echo $_POST['webmark'];?></td>
       </tr>
      <tr>
        <td>Total marks:</td>
        <td><?php $total = $_POST['englishmark']+$_POST['csmark']+$_POST['englishmark']+$_POST['mathsmark'];
         echo $total;?></td>
     </tr>
         
    </table>
</body>
</html>



