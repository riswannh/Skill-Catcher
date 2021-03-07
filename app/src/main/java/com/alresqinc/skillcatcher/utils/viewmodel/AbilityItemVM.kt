package com.alresqinc.skillcatcher.utils.viewmodel

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.alresqinc.skillcatcher.R
import com.alresqinc.skillcatcher.dao.Ability
import com.alresqinc.skillcatcher.databinding.AbilityItemBinding

class AbilityItemVM(val data: Ability,val binding:AbilityItemBinding) : ViewModel() {
    var nameAbility: ObservableField<String> = ObservableField()
    var cost: ObservableField<String> = ObservableField()
    var costType: ObservableField<String> = ObservableField()
    var desc: ObservableField<String> = ObservableField()

    init {
        nameAbility.set(data.nameAbility)
        cost.set(data.cost.toString())
        if (data.costType == 0) costType.set("HP") else costType.set("SP")
        desc.set(data.desc)
        binding.ivAbility.setImageResource(data.icon)
    }
}