package com.android.havid.binar_ch5_challenge_suit

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.system.Os.close
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class ChooseMode : AppCompatActivity() {
    private val binding : ActivityChooseModeBinding by lazy {
        ActivityChooseModeBinding.inflate(layoutInflater) }
    val username by lazy { intent.getStringExtra("username") }

    @SuppressLint("SetText")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initDataView()
        snackBarView()
    }

    private fun initDataView(){
        binding.pvp.text = "$username" + " VS " + "Player"
        binding.pvc.text = "$username" + " VS " + "COM"

        binding.player_vs_player.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("username", username)
            intent.putExtra("mode", true)
            startActivity(intent)
        }

        binding.player_vs_com.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("username", username)
            intent.putExtra("mode", false)
            startActivity(intent)
        }
    }

    private fun snackBarView(){
        Snackbar.make(binding.root, "selamat Datang" + "$username", Snackbar.LENGTH_LONG)
            .setAction(getString(R.string.close)){
            }.show()
    }
}