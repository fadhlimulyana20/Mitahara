//package com.kelompok5.mitahara
//
//import android.os.Build
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.text.Html
//import android.text.Spanned
//import android.util.Log
//import androidx.core.text.HtmlCompat
//import androidx.core.text.toSpanned
//import androidx.recyclerview.widget.LinearLayoutManager
//import androidx.recyclerview.widget.RecyclerView
//import com.google.gson.Gson
//import com.kelompok5.mitahara.adapter.IngredientsAdapter
//import com.kelompok5.mitahara.adapter.NutritionsAdapter
//import com.kelompok5.mitahara.data.model.DietPlanModel
//import com.kelompok5.mitahara.databinding.ActivityAddDietPlanBinding
//import com.kelompok5.mitahara.databinding.ActivityDietPlanDetailBinding
//import com.kelompok5.mitahara.utils.db.DataDummy
//import com.kelompok5.mitahara.utils.db.food_data
//import com.kelompok5.mitahara.utils.db.telur_data
//
//class DietPlanDetailActivity : AppCompatActivity() {
//    private lateinit var binding : ActivityDietPlanDetailBinding
//    private val dummyData = DataDummy()
//    private var ingAdapter = IngredientsAdapter()
//    private var nutrAdapter = NutritionsAdapter()
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityDietPlanDetailBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//        supportActionBar?.hide()
//
//        val data = Gson().fromJson(intent.getStringExtra(food_data), DietPlanModel::class.java)
//
//        Log.e("Coba", "onCreate: ${data.name}" )
//
//        binding.run {
//            etBack.setOnClickListener {
//                finish()
//            }
//
//            //for check data telur or capcay
//            if (data.name == telur_data){
//                ingAdapter.setIngradientsList(dummyData.listIngredientsTelur)
//                nutrAdapter.setListNutritions(dummyData.listNutritionsTelur)
//                tvStepDetail.text = HtmlCompat.fromHtml(dummyData.stepTelur, 0)
//            }else{
//                ingAdapter.setIngradientsList(dummyData.listIngredientsCapcay)
//                nutrAdapter.setListNutritions(dummyData.listNutritionsCapcay)
//                tvStepDetail.text = HtmlCompat.fromHtml(dummyData.stepCapcay, 0)
//            }
//            rvNutritions.layoutManager = LinearLayoutManager(this@DietPlanDetailActivity, RecyclerView.HORIZONTAL, false)
//            rvIngredients.layoutManager = LinearLayoutManager(this@DietPlanDetailActivity,RecyclerView.VERTICAL, false)
//            rvNutritions.adapter = nutrAdapter
//            rvIngredients.adapter = ingAdapter
//            tvNameDetail.text = data.name
//            tvCategoryDetail.text = data.category
//
//
//
//        }
//    }
//}