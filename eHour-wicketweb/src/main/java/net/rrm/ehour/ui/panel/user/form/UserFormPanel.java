/**
 * Created on Aug 11, 2007
 * Created by Thies Edeling
 * Copyright (C) 2005, 2006 te-con, All Rights Reserved.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 * 
 * thies@te-con.nl
 * TE-CON
 * Legmeerstraat 4-2h, 1058ND, AMSTERDAM, The Netherlands
 *
 */

package net.rrm.ehour.ui.panel.user.form;

import java.util.List;

import net.rrm.ehour.ui.border.GreyRoundedBorder;
import net.rrm.ehour.ui.page.admin.mainconfig.MainConfig.LocaleChoiceRenderer;
import net.rrm.ehour.user.domain.UserDepartment;
import net.rrm.ehour.user.domain.UserRole;

import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.PropertyModel;

/**
 * User Panel 
 **/

public class UserFormPanel extends Panel
{
	private static final long serialVersionUID = -7427807216389657732L;

	public UserFormPanel(String id, CompoundPropertyModel userModel, List<UserRole> roles, List<UserDepartment> departments)
	{
		super(id, userModel);
		
		GreyRoundedBorder greyBorder = new GreyRoundedBorder("border");
		add(greyBorder);
		
		Form form = new Form("userForm");
		form.add(new RequiredTextField("username"));
		form.add(new PasswordTextField("password"));

		form.add(new RequiredTextField("firstName"));
		form.add(new RequiredTextField("lastName"));
		form.add(new TextField("email"));

//		DropDownChoice userRole = new DropDownChoice("localeSelection",
//				new PropertyModel(configBackingBean, "locale"),
//				new PropertyModel(configBackingBean, "availableLanguages"),
//				new LocaleChoiceRenderer()); 
//
//		form.add(userRole);
		
		greyBorder.add(form);
	}

}
