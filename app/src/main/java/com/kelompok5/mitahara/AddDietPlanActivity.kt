package com.kelompok5.mitahara

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.gson.Gson
import com.kelompok5.mitahara.data.model.DietPlanModel
import com.kelompok5.mitahara.data.model.NutritionsModel
import com.kelompok5.mitahara.databinding.ActivityAddDietPlanBinding
import com.kelompok5.mitahara.utils.db.food_data

class AddDietPlanActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddDietPlanBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddDietPlanBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.run {
            tvBreakfast.setOnClickListener {
                tvBreakfast.setBackgroundResource(R.drawable.rounded_pink_black)
                tvBreakfast.setPadding(16, 16, 16, 16)
                tvLunch.setBackgroundResource(R.drawable.shape_line_grey)
                tvLunch.setPadding(16, 16, 16, 16)
                tvDiner.setBackgroundResource(R.drawable.shape_line_grey)
                tvDiner.setPadding(16, 16, 16, 16)
            }

            tvLunch.setOnClickListener {
                tvLunch.setBackgroundResource(R.drawable.rounded_pink_black)
                tvLunch.setPadding(16, 16, 16, 16)
                tvBreakfast.setBackgroundResource(R.drawable.shape_line_grey)
                tvBreakfast.setPadding(16, 16, 16, 16)
                tvDiner.setBackgroundResource(R.drawable.shape_line_grey)
                tvDiner.setPadding(16, 16, 16, 16)
            }

            tvDiner.setOnClickListener {
                tvDiner.setBackgroundResource(R.drawable.rounded_pink_black)
                tvDiner.setPadding(16, 16, 16, 16)
                tvLunch.setBackgroundResource(R.drawable.shape_line_grey)
                tvLunch.setPadding(16, 16, 16, 16)
                tvBreakfast.setBackgroundResource(R.drawable.shape_line_grey)
                tvBreakfast.setPadding(16, 16, 16, 16)
            }

            btnSave.setOnClickListener {
                Toast.makeText(this@AddDietPlanActivity, "Saved", Toast.LENGTH_SHORT).show()
                finish()
            }
        }
    }
}