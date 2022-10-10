<?php
function getMaxMin($input_text): string
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

    $maxModule = $module_marks[0]['module'] . ', ' . $module_marks[0]['marks'];
    $minModule = $module_marks[count($module_marks)-1]['module'] . ', ' . $module_marks[count($module_marks)-1]['marks'];
    return $maxModule . 'newline' . $minModule;
}
