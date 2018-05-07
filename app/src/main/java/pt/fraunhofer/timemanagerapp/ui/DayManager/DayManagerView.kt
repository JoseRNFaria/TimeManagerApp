package pt.fraunhofer.timemanagerapp.ui.DayManager

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_day_manager.*
import pt.fraunhofer.timemanagerapp.R
import pt.fraunhofer.timemanagerapp.ui.Main.MainView
import pt.fraunhofer.timemanagerapp.utils.Constants

class DayManagerView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_day_manager)

        val day= intent.getIntExtra(Constants.DAY_LABEL,0)
        val month= intent.getIntExtra(Constants.MONTH_LABEL,0)
        val year= intent.getIntExtra(Constants.YEAR_LABEL,0)


        text_view.text="$day / $month / $year"
    }

    override fun onBackPressed() {
        val newIntent = Intent(this@DayManagerView, MainView::class.java)
        startActivity(newIntent)
        finish()
    }
}
