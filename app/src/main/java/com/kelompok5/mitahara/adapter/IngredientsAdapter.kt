//package com.kelompok5.mitahara.adapter
//
//import android.view.LayoutInflater
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import com.kelompok5.mitahara.data.model.IngredientsModel
//import com.kelompok5.mitahara.databinding.ItemIngredientsBinding
//
//class IngredientsAdapter : RecyclerView.Adapter<IngredientsAdapter.IngredientsViewHolder>() {
//
//    private val list = mutableListOf<IngredientsModel>()
//
//    fun setIngradientsList(data : List<IngredientsModel>){
//        list.clear()
//        list.addAll(data)
//        notifyDataSetChanged()
//    }
//
//    override fun onCreateViewHolder(
//        parent: ViewGroup,
//        viewType: Int
//    ): IngredientsAdapter.IngredientsViewHolder {
//        return IngredientsViewHolder(ItemIngredientsBinding.inflate(LayoutInflater.from(parent.context), parent,false))
//    }
//
//    override fun onBindViewHolder(holder: IngredientsAdapter.IngredientsViewHolder, position: Int) {
//        val data = list[position]
//        holder.bindData(data)
//    }
//
//    override fun getItemCount() = list.size
//
//    inner class IngredientsViewHolder(val binding : ItemIngredientsBinding) : RecyclerView.ViewHolder(binding.root) {
//
//        fun bindData(data : IngredientsModel){
//            binding.run {
//                tvNameIngredients.text = data.data
//            }
//        }
//    }
//}