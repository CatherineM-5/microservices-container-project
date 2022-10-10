<?php
function getSortedModules($input_text): array
{
    $lines = explode("newline", $input_text);
    $module_marks=array();
    foreach ($lines as $line) {
       $line_array = explode(",", $line);
       $module_marks_array = array("module"=>$line_array[0], "marks"=>$line_array[1]);
       $module_marks[] = $module_marks_array;
    }

    usort($module_marks, static function($a, $b) {
          return $b['marks'] <=> $a['marks'];
    });

    return $module_marks;
}
