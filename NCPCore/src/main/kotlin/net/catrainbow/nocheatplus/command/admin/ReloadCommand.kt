/*
 * This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in thCut even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.catrainbow.nocheatplus.command.admin

import cn.nukkit.command.CommandSender
import net.catrainbow.nocheatplus.NoCheatPlus
import net.catrainbow.nocheatplus.command.NCPSubCommand
import net.catrainbow.nocheatplus.components.config.NCPConfigCom
import net.catrainbow.nocheatplus.components.data.ConfigData
import net.catrainbow.nocheatplus.utilities.i18n.I18N.Companion.getString

class ReloadCommand : NCPSubCommand("reload") {

    override fun getDescription(): String {
        return getString("command.reload.description")
    }

    override fun getAliases(): Array<String> {
        return arrayOf("reload")
    }

    override fun execute(sender: CommandSender, label: String, args: Array<out String>): Boolean {
        sender.sendMessage("${ConfigData.logging_prefix}${getString("command.reload.reloading")}")
        (NoCheatPlus.instance.getNCPComponent("NCP Config") as NCPConfigCom).reload()
        (NoCheatPlus.instance).getNCPComponent("NCP Permission").onDisabled()
        (NoCheatPlus.instance).getNCPComponent("NCP Permission").onEnabled()
        sender.sendMessage("${ConfigData.logging_prefix}${getString("command.reload.success")}")
        return true
    }

}