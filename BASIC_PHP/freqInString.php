<?php
if (isset($_POST['submit'])) {
    $str = $_POST['name1'];
    $freq = array();

    for ($i = 0; $i < strlen($str); $i++) {
        array_push($freq, 1);
        for ($j = $i + 1; $j < strlen($str); $j++) {
            if ($str[$i] == $str[$j]) {
                $freq[$i]++;

                $str[$j] = '0';
            }
        }
    }

    echo ("Characters and their corresponding frequencies <br>");
    for ($i = 0; $i < count($freq); $i++) {
        if ($str[$i] != ' ' && $str[$i] != '0') {
            echo ($str[$i] . "-" . $freq[$i]);
            echo ("<br>");
        }
    }
}
