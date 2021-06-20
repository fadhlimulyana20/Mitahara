//package com.kelompok5.mitahara.adapter
//
//import android.view.LayoutInflater
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import com.kelompok5.mitahara.data.model.NutritionsModel
//import com.kelompok5.mitahara.databinding.ItemNutritionsBinding
//
//class NutritionsAdapter : RecyclerView.Adapter<NutritionsAdapter.NutritionsViewHoler>() {
//
//    private val list = mutableListOf<NutritionsModel>()
//
//    fun setListNutritions(data : List<NutritionsModel>){
//        list.clear()
//        list.addAll(data)
//        notifyDataSetChanged()
//    }
//
//    override fun onCreateViewHolder(
//        parent: ViewGroup,
//        viewType: Int
//    ): NutritionsAdapter.NutritionsViewHoler {
//        return NutritionsViewHoler(ItemNutrititionsBinding.inflate(LayoutInflater.from(parent.context), parent, false))
//    }
//
//    override fun onBindViewHolder(holder: NutritionsAdapter.NutritionsViewHoler, position: Int) {
//        val data = list[position]
//        holder.bindData(data)
//    }
//
//    override fun getItemCount() = list.size
//
//    inner class NutritionsViewHoler(val binding : ItemNutrititionsBinding) : RecyclerView.ViewHolder(binding.root){
//
//        fun bindData(data : NutritionsModel){
//            binding.run {
//                tvNumberNutritions.text = data.number
//                tvNameNutritions.text = data.name
//                tvValueNutritions.text = data.type
//            }
//        }
//
//    }
//}