<?php $dups = array();
foreach (array_count_values($arr) as $val => $c)
    if ($c > 1) $dups[] = $val;
