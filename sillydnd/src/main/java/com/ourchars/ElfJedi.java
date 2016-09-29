package com.ourchars;

import com.app.Weapons;
import com.app.Weapons.Weapon;
import com.interfaces.Jedi;
import com.parents.Elf;

public class ElfJedi extends Elf implements Jedi {
	
	
	

	public ElfJedi() {
		super();
		// TODO Auto-generated constructor stub
	}

	//added Weapon weapon
	public ElfJedi(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeHealth() {
		// TODO Auto-generated method stub

	}

	@Override
	public void changeMagic() {
		// TODO Auto-generated method stub
		super.setMagic(magic + 100);
	}

	@Override
	public void setWeapon(Weapon weapon) {
		super.setWeapon(Weapon.LIGHTSABER);

	}
	

}
