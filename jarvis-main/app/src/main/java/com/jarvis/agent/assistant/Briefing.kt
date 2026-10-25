package com.jarvis.agent.assistant

import android.content.Context
import android.os.BatteryManager
import java.util.Calendar

/** Eslatma vaqti kelganda aytiladigan qisqa, internet talab qilmaydigan hisobot. */
object Briefing {
    fun build(ctx: Context): String {
        val c = Calendar.getInstance()
        val hour = c.get(Calendar.HOUR_OF_DAY).toString().padStart(2, '0')
        val minute = c.get(Calendar.MINUTE).toString().padStart(2, '0')
        val battery = ctx.getSystemService(BatteryManager::class.java)
            .getIntProperty(BatteryManager.BATTERY_PROPERTY_CAPACITY)
        val count = Reminders.all(ctx).count { it.briefing || it.daily }
        return "Salom! Hozir soat $hour:$minute. Telefon quvvati $battery foiz. " +
            "Sizda $count ta kundalik eslatma bor."
    }
}
