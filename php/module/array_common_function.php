<?php
/***
 * 数组常用函数
 *
**/ 

/**
 * 根据传入的数组和数组中值的键值，将对数组的键进行替换
 *
 * @param array $array
 * @param string $key
 */
function array_bind_key($array, $key ){
	foreach( (array)$array as $value ){
		if(!empty($value[$key])){
			$k = $value[$key];
			$result[$k] = $value;
		}
	}
	return $result;
}

/**
 * 根据传入的数组和数组中的键值，将对数组进行排序
 *
 * @param array $array 二维数组
 * @param string $field	字段
 * @param string $direction 排序
 */
function array_sort_key($arr, $field, $direction='SORT_ASC'){
	$arrSort = array();
	foreach($arr AS $uniqid => $row){
		foreach($row AS $key=>$value){
			$arrSort[$key][$uniqid] = $value;
		}
	}
	array_multisort($arrSort[$field], constant($direction), $arr);
	return $arr;
}