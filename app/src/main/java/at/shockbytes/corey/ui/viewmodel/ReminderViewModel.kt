package at.shockbytes.corey.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import at.shockbytes.core.viewmodel.BaseViewModel
import at.shockbytes.corey.data.reminder.ReminderManager
import javax.inject.Inject

class ReminderViewModel @Inject constructor(
    private val reminderManager: ReminderManager
) : BaseViewModel() {

    private val isWorkoutReminderEnabled = MutableLiveData<Boolean>()
    fun isWorkoutReminderEnabled(): LiveData<Boolean> = isWorkoutReminderEnabled

    private val isWeighReminderEnabled = MutableLiveData<Boolean>()
    fun isWeighReminderEnabled(): LiveData<Boolean> = isWeighReminderEnabled

    init {
        isWorkoutReminderEnabled.postValue(reminderManager.isWorkoutReminderEnabled)
        isWeighReminderEnabled.postValue(reminderManager.isWeighReminderEnabled)
    }

    fun enableWorkoutReminder(isEnabled: Boolean) {
        reminderManager.isWorkoutReminderEnabled = isEnabled
        isWorkoutReminderEnabled.postValue(isEnabled)
    }

    fun enableWeighReminder(isEnabled: Boolean) {
        reminderManager.isWeighReminderEnabled = isEnabled
        isWeighReminderEnabled.postValue(isEnabled)
    }

    fun setHourOfWeighReminder(hour: Int) {
        TODO("not implemented") // To change body of created functions use File | Settings | File Templates.
    }

    fun setHourOfWorkoutReminder(hour: Int) {
        TODO("not implemented") // To change body of created functions use File | Settings | File Templates.
    }
}