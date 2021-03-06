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



import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public interface IContainer {

	public TileEntity createNewTileEntity(World world);

	public TileEntity createTileEntity(World world, int meta);

	public void onBlockAdded(World world, int x, int y, int z);
}
