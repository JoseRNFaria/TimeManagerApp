package pt.fraunhofer.timemanagerapp.ui.Main

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CalendarView
import kotlinx.android.synthetic.main.activity_main.*
import pt.fraunhofer.timemanagerapp.R
import pt.fraunhofer.timemanagerapp.ui.DayManager.DayManagerView
import pt.fraunhofer.timemanagerapp.utils.Constants
import java.util.*

class MainView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calendar_view.setDate(Calendar.getInstance().timeInMillis,false,true)

        calendar_view.setOnDateChangeListener({ calendarView: CalendarView, year: Int, month: Int, day: Int ->
            Log.d("calendar","$day / $month / $year ")

            val newIntent = Intent(this@MainView, DayManagerView::class.java)

            newIntent.putExtra(Constants.DAY_LABEL,day)
            newIntent.putExtra(Constants.MONTH_LABEL,month)
            newIntent.putExtra(Constants.YEAR_LABEL,year)
            startActivity(newIntent)
            finish()
        })
    }


}
