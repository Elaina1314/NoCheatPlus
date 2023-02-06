/*
 * This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.catrainbow.nocheatplus.checks.moving.magic

/**
 * Keeping some magic confined in here.
 *
 * @author aso-fold
 * @author Catrainbow
 *
 * 添加基岩版数据,并修改Java版中不合理的数据
 *
 */
object Magic {

    //Java版数据
    //aso-fold
    const val DEFAULT_WALK_SPEED = 0.2
    const val DEFAULT_FLY_SPEED = 0.1
    private const val GRAVITY_MAX = 0.0834
    private const val GRAVITY_MIN = 0.0624
    private const val GRAVITY_SPAN = GRAVITY_MAX - GRAVITY_MIN
    private const val GRAVITY_ODD = 0.05
    const val GRAVITY_VAC_C = (GRAVITY_MIN * 0.6).toFloat()
    const val FRICTION_MEDIUM_AIR = 0.98
    const val FRICTION_MEDIUM_WATER = 0.89
    const val FRICTION_MEDIUM_LAVA = 0.535
    const val WALK_SPEED = 0.221
    const val modSneak = 0.13 / WALK_SPEED
    const val modBlock = 0.16 / WALK_SPEED
    private const val modSwim = 0.115 / WALK_SPEED
    val modDepthStrider = doubleArrayOf(
        1.0,
        0.1645 / modSwim / WALK_SPEED,
        0.1995 / modSwim / WALK_SPEED,
        1.0 / modSwim
    )
    const val modDownStream = 0.19 / (WALK_SPEED * modSwim)
    const val GLIDE_HORIZONTAL_GAIN_MAX = GRAVITY_MAX / 2.0
    const val GLIDE_DESCEND_PHASE_MIN = -GRAVITY_MAX - GRAVITY_SPAN
    const val GLIDE_DESCEND_GAIN_MAX_NEG = -GRAVITY_MAX
    const val GLIDE_DESCEND_GAIN_MAX_POS = GRAVITY_ODD / 1.95
    const val Y_ON_GROUND_MIN = 0.00001
    const val Y_ON_GROUND_MAX = 0.0626
    const val Y_ON_GROUND_DEFAULT = 0.016
    const val FALL_DAMAGE_DIST = 3.0
    const val FALL_DAMAGE_MINIMUM = 0.5
    const val BOUNCE_VERTICAL_MAX_DIST = 3.5
    const val PAPER_DIST = 0.01
    const val EXTREME_MOVE_DIST_VERTICAL = 4.0
    const val EXTREME_MOVE_DIST_HORIZONTAL = 22.0
    const val CHUNK_LOAD_MARGIN_MIN = 3.0

    //Bedrock
    //Catrainbow
    const val SPRINT_CHANGE_MAX_SPEED = 0.41
    const val SPRINT_CHANGE_FACE_BLOCK_MAX_SPEED = 0.43
    const val SPRINT_CHANGE_SPEED_ADDITION = 0.004478
    const val SPRINT_CHANGE_SPEED_ADDITION_V2 = 0.00522
    const val SPRINT_CHANGE_SPEED_BACK_DIRECTION = 0.098
    const val JUMP_BOOST_V2_MAX_HEIGHT = 1.9968048095703068
    const val JUMP_BOOST_V1_MAX_HEIGHT = 1.4161010742187443
    const val JUMP_NORMAL_WALK = 0.9321990966796818
    const val BLOCK_BUNNY_MIN = 1.34919165538
    const val BLOCK_BUNNY_MAX = 1.35221
    const val BLOCK_BUNNY_BYPASS_V1_MAX = 1.9361004590988102
    const val BLOCK_BUNNY_BYPASS_V1_MIN = 1.93609771
    const val BLOCK_BUNNY_BYPASS_V2_MIN = 2.178598022460932
    const val BLOCK_BUNNY_BYPASS_V2_MAX = 2.3
    const val BUNNY_HOP_MAX_SPEED = 0.71
    const val BUNNY_HOP_MAX_SPEED_MAX = 0.74
    const val BUNNY_DOWN_MAX_SPEED = 2.16
    const val BUNNY_UP_MAX_SPEED = 2.5
    const val SPEED_BOOST_V1_BUNNY_HOP = 0.76
    const val SPEED_BOOST_V2_BUNNY_HOP = 0.82

    const val BUNNY_HOP_TINY_JUMP_FIRST = 0.7531994581222534
    const val BUNNY_HOP_TINY_JUMP_SECOND = 2.7418136596679688E-6
    const val BUNNY_TINY_JUMP_MAX = 0.40
    const val BUNNY_TINY_JUMP_FRICTION = 0.43
    const val BUNNY_TINY_JUMP_SPEED_BOOST_V1 = 0.48
    const val BUNNY_TINY_JUMP_SPEED_BOOST_V2 = 0.50
    const val BUNNY_TINY_DIRECTION_HEIGHT = 0.17
    const val BUNNY_TINY_THIN_SPEED_MAX = 1.23
    const val DEFAULT_JUMP_HEIGHT = 0.42

    //特殊方块
    const val BUNNY_ICE_GROUND_DEFAULT = 0.72
    const val BUNNY_ICE_SHORT_BUNNY_SPEED_MAX = 1.52
    const val BUNNY_UP_BLOCK_ADDITION = 0.18

    //饥饿数值
    const val HUNGER_BUNNY_MAX_SPEED = 0.86
    const val HUNGER_BUNNY_Y_MAX = 0.421
    const val HUNGER_BUNNY_Y_MIN = 0.1
    const val HUNGER_BUNNY_VERTICAL_MAX_SHORT = 1.33
    const val HUNGER_BUNNY_VERTICAL_MAX_LONG = 1.33

    //香草飞数据
    const val VANILLA_Y_DIFF = 0.08589999437332158
    const val VANILLA_Y_DIFF_V2 = 0.0784000015258789
    const val VANILLA_Y_DELTA = 0.375

    //下蹲
    const val SNEAK_JUMP_VERTICAL_MAX = 0.86

    //重力
    const val TINY_GRAVITY = 0.9800000190734863

    //蜘蛛网
    const val GROUND_COBWEB_MAX_SPEED = 0.032
    const val GROUND_COBWEB_MAX_MOTION_Y = 0.021
    const val GROUND_COBWEB_VERTICAL_SPEED_MIN = 0.0845
    const val GROUND_COBWEB_VERTICAL_SPEED_MAX = 0.085

    //攀爬
    const val LIMITED_CLIMB_SPEED = 0.20
    const val CLIMB_SPEED_AVG = 0.12

    fun swimBaseSpeedV(): Double {
        return WALK_SPEED * modSwim + 0.02
    }

}