package com.alresqinc.skillcatcher.main

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.alresqinc.skillcatcher.R
import com.alresqinc.skillcatcher.dao.Ability
import com.alresqinc.skillcatcher.databinding.CombatBinding
import com.alresqinc.skillcatcher.utils.adapter.CombatAbilityAdapter


class MainActivity : AppCompatActivity() {
    private val context: Context = this
    private var turn = 0
    private var isTurn = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: CombatBinding =
            DataBindingUtil.setContentView(this, R.layout.combat)
        val listAbility = listOf(
            Ability(0,"Attack",10,0,"Deal Damage 100% of Atk",100,R.drawable.ability_attack),
            Ability(0,"Attack",10,1,"Deal Damage 110% of Atk",110,R.drawable.ability_ring_of_fire)
        )

        val abilityAdapter = CombatAbilityAdapter(listAbility)
        binding.rvAbility.apply {
            adapter =abilityAdapter
        }
    }
}