

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap" rel="stylesheet">
    <title>Document</title>
    <style>
        body {
            font-family : "Poppins";
        }
        form{
            border:1px solid black;
            height:60vh;
            align-content:center;
            padding:20px;
        }
        div {
            width: 400px;
            display: grid;
            grid-template-columns: 1fr 1fr;
            row-gap: 2rem;
            margin-bottom: 1rem;
        }
    </style>
</head>
<body>
    <form action="new.php" method="POST">
        <div>
            <label for="name">name:</label>
            <input name="name" id="name" type="text">
        </div>
        <div>
            <label for="age">age:</label>
            <input name="age" id="age" type="number">
        </div>
    <div>
            <label for="cs">cs:</label>
            <input name="csmark" id="cs" type="number">
    </div>
    <div>
            <label for="eng">english:</label>
            <input name="englishmark" id="eng" type="number">
    </div>
    <div>
            <label for="maths">maths:</label>
            <input name="mathsmark" id="maths" type="number">
    </div>
    <div>
            <label for="web">web:</label>
            <input name="webmark" id="web" type="number">
    </div>
    <br>
    <br>
        <input type="submit" value="calculate total mark">
    </form>
</body>
</html>