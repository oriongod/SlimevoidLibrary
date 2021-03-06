/*
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version. This program is distributed in the hope that it will be
 * useful, but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
 * Public License for more details. You should have received a copy of the GNU
 * Lesser General Public License along with this program. If not, see
 * <http://www.gnu.org/licenses/>
 */
package slimevoid.lib;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import slimevoid.lib.network.PacketTileEntity;
import slimevoid.lib.network.PacketUpdate;

public interface IPacketHandling {
	public void handleTileEntityPacket(PacketTileEntity packet, EntityPlayer entityplayer, World world);

	public void handleGuiPacket(PacketUpdate packet, EntityPlayer entityplayer, World world);

	public void handlePacket(PacketUpdate packet, EntityPlayer entityplayer, World world);
}