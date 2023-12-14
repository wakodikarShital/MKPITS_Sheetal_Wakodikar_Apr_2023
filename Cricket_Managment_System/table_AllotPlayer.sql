use Cricket_Managment_System

create table Team_Player(teamId varchar(50),playerId int,
constraint teams_player foreign key(teamId) references teams(teamId),
constraint teams_player1 foreign key(playerId) references players(playerId)
)

select * from Team_Player
select playerId from Team_Player where teamId='101'

insert into Team_Player(teamId,playerId) values('101',1);

 
 