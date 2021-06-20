//package com.kelompok5.mitahara.adapter
//
//import android.view.LayoutInflater
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import com.kelompok5.mitahara.data.model.DietPlanModel
//import com.kelompok5.mitahara.databinding.ItemDietPlanBinding
//import com.kelompok5.mitahara.utils.ItemClickListener
//
//class DietPlanAdapter(private val listener: ItemClickListener<DietPlanModel>) : RecyclerView.Adapter<DietPlanAdapter.DietPlanViewHolder>() {
//
//    private val listDiet = mutableListOf<DietPlanModel>()
//
//    fun setListDiet(dietPLan : List<DietPlanModel>){
//        listDiet.clear()
//        listDiet.addAll(dietPLan)
//        notifyDataSetChanged()
//    }
//
//    override fun onCreateViewHolder(
//        parent: ViewGroup,
//        viewType: Int
//    ): DietPlanAdapter.DietPlanViewHolder {
//        return DietPlanViewHolder(ItemDietPlanBinding.inflate(LayoutInflater.from(parent.context),parent,false))
//    }
//
//
//    override fun onBindViewHolder(holder: DietPlanAdapter.DietPlanViewHolder, position: Int) {
//        val data = listDiet[position]
//        holder.bindData(data)
//
//        holder.itemView.setOnClickListener {
//            listener.onClick(data,position)
//        }
//    }
//
//    override fun getItemCount() = listDiet.size
//
//    inner class DietPlanViewHolder (val binding : ItemDietPlanBinding) : RecyclerView.ViewHolder(binding.root) {
//
//        fun bindData(data : DietPlanModel){
//
//            binding.run {
//                ivDiet.setImageResource(data.image)
//                tvTitle.text = data.name
//                tvCategory.text = data.category
//                tvCalories.text = data.calories
//            }
//        }
//
//    }
//
//
//}