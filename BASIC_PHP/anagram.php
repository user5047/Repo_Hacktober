<?php
function is_anagram($string_1, $string_2)
{
    if (count_chars($string_1, 1) == count_chars($string_2, 1))
        return 'yes';
    else
        return 'no';
}

print_r(is_anagram('program', 'grampro') . "\n");
print_r(is_anagram('card', 'cart') . "\n");
