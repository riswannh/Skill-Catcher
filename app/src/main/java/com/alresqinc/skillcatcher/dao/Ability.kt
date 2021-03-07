package com.alresqinc.skillcatcher.dao

data class Ability(
    var idAbility:Int,
    var nameAbility:String,
    var cost:Int,
    var costType:Int,
    var desc:String,
    var dmgMultiplier:Int,
    var icon:Int
)
