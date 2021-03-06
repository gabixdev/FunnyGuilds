package net.dzikoysk.funnyguilds.event.guild.member;

import net.dzikoysk.funnyguilds.basic.guild.Guild;
import net.dzikoysk.funnyguilds.basic.user.User;

public class GuildMemberInviteEvent extends GuildMemberEvent {

    public GuildMemberInviteEvent(EventCause eventCause, User doer, Guild guild, User member) {
        super(eventCause, doer, guild, member);
    }

    @Override
    public String getDefaultCancelMessage() {
        return "[FunnyGuilds] Member invitation sending has been cancelled by the server!";
    }
    
}
