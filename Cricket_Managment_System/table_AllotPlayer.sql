use Cricket_Managment_System

create table team_player(team_id varchar(50),player_id int,
constraint teams_player foreign key(team_id) references teams(team_id),
constraint teams_player1 foreign key(player_id) references players(player_id)
)



select * from team_player

insert into team_player(team_id,player_id) values('101',1);

select * from players

 
 