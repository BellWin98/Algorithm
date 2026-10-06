select 
    ugb.title,
    ugb.board_id,
    ugr.reply_id,
    ugr.writer_id,
    ugr.contents,
    ugr.created_date
from used_goods_board ugb
join used_goods_reply ugr on ugb.board_id = ugr.board_id
where ugb.created_date like '2022-10-%'
order by ugr.created_date, ugb.title