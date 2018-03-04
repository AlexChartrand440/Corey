package at.shockbytes.corey.adapter

import android.app.Fragment
import android.app.FragmentManager
import android.support.v13.app.FragmentStatePagerAdapter
import at.shockbytes.corey.common.core.workout.model.TimeExercise
import at.shockbytes.corey.common.core.workout.model.Workout
import at.shockbytes.corey.fragment.workoutpager.WearExercisePagerFragment
import at.shockbytes.corey.fragment.workoutpager.WearTimeExercisePagerFragment


/**
 * @author Martin Macheiner
 * Date: 03.12.2015.
 */

// FragmentStatePagerAdapter
class WearExercisePagerAdapter(fm: FragmentManager,
                               private val workout: Workout) : FragmentStatePagerAdapter(fm) {

    override fun getCount(): Int {
        return workout.exercises.size
    }

    override fun getItem(position: Int): Fragment {

        val exercise = workout.exercises[position]
        return if (exercise is TimeExercise) {
            WearTimeExercisePagerFragment.newInstance(exercise)
        } else {
            WearExercisePagerFragment.newInstance(exercise)
        }
    }

}