package nerdex.io;/*
 * SkypeAPI
 * Copyright (C) 2017 RapidTheNerd
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GroupCall {

    private String topic;
    private ArrayList<User> users = new ArrayList<User>();

    protected GroupCall(String topic, String... names){
        this.topic = topic;

        for(String users : names)
    }

    public ArrayList<User> getUsers(){
        return users;
    }
    public void call(CallTypeEnum call){
        String uri = "";
        for(User user : users) uri += user.getName() + ";";
        uri = uri.substring(0, uri.indexOf(";"));
        uri += "?call&video=" + call.isVideo() + "&topic=" + topic.replaceAll(" ", "%20");
        
    }
}
