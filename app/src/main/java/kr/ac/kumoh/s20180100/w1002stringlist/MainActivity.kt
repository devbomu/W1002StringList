package kr.ac.kumoh.s20180100.w1002stringlist

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kr.ac.kumoh.s20180100.w1002stringlist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val songs = arrayOf(
        "리와인드", "겨울봄", "But You Want More", "잔향상가", "표리일체",
        "리와인드", "겨울봄", "But You Want More", "잔향상가", "표리일체",
        "리와인드", "겨울봄", "But You Want More", "잔향상가", "표리일체",
        "리와인드", "겨울봄", "But You Want More", "잔향상가", "표리일체",
        "리와인드", "겨울봄", "But You Want More", "잔향상가", "표리일체",
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.list.adapter = ArrayAdapter<String>(this,
            android.R.layout.simple_list_item_1,
            songs
        )

        binding.list.setOnItemClickListener { _, _, i, _ ->
            val uri = Uri.parse("http://youtube.com/results?search_query=노래방+" + songs[i])
            val youtube = Intent(Intent.ACTION_VIEW, uri)
            startActivity(youtube)
        }
    }
}