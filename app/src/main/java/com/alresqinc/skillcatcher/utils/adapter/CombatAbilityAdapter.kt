package com.alresqinc.skillcatcher.utils.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.alresqinc.skillcatcher.R
import com.alresqinc.skillcatcher.dao.Ability
import com.alresqinc.skillcatcher.databinding.AbilityItemBinding
import com.alresqinc.skillcatcher.databinding.CombatBinding
import com.alresqinc.skillcatcher.utils.viewmodel.AbilityItemVM

class CombatAbilityAdapter(private val ability: List<Ability>) :
    RecyclerView.Adapter<CombatAbilityAdapter.AbilityHolder>() {


    class AbilityHolder(val binding: AbilityItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun getBindingView(): AbilityItemBinding {
            return binding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AbilityHolder {
        var binding: AbilityItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.ability_item, parent, false
        )
        return AbilityHolder(binding)
    }

    override fun onBindViewHolder(holder: AbilityHolder, position: Int) {
        holder.getBindingView().vm = AbilityItemVM(ability[position],holder.getBindingView())
    }

    override fun getItemCount(): Int {
        return ability.size
    }


}