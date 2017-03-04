package com.vladsch.flexmark.ext.emoji;

import com.vladsch.flexmark.ext.emoji.internal.EmojiCheatSheet;

import java.util.*;

public class EmojiDumpMissingCheatSheetTest {

    //@Test
    public void dumpMissingCategories() throws Exception {
        System.out.println("\n## No Entry\n");
        for (String fileName : files) {
            EmojiCheatSheet.EmojiShortcut shortcut = EmojiCheatSheet.getImageShortcut(fileName);

            if (shortcut == null) {
                System.out.println(String.format("* %s", fileName));
            }
        }

        System.out.println("\n## No Category\n");
        Set<String> categories = new HashSet<String>();

        for (Map.Entry<String, EmojiCheatSheet.EmojiShortcut> entry : EmojiCheatSheet.shortCutMap.entrySet()) {
            EmojiCheatSheet.EmojiShortcut shortcut = entry.getValue();
            if (shortcut.category == null || shortcut.category.isEmpty()) {
                System.out.println(String.format("* :%s: %s", shortcut.name, entry.getKey()));
            } else {
                categories.add(shortcut.category);
            }
        }

        System.out.println("\n## No GitHub URL\n");
        for (Map.Entry<String, EmojiCheatSheet.EmojiShortcut> entry : EmojiCheatSheet.shortCutMap.entrySet()) {
            EmojiCheatSheet.EmojiShortcut shortcut = entry.getValue();
            if (shortcut.url == null || shortcut.url.isEmpty()) {
                System.out.println(String.format("* :%s: %s", shortcut.name, entry.getKey()));
            }
        }

        System.out.println("\n## Categorized\n");
        List<String> categoryList = new ArrayList<String>(categories);
        Collections.sort(categoryList);

        for (String category : categoryList) {
            System.out.println("\n### " + category + "\n");
            List<String> shortcuts = new ArrayList<String>();

            for (Map.Entry<String, EmojiCheatSheet.EmojiShortcut> entry : EmojiCheatSheet.shortCutMap.entrySet()) {
                EmojiCheatSheet.EmojiShortcut shortcut = entry.getValue();

                if (category.equals(shortcut.category)) {
                    shortcuts.add(entry.getKey());
                }
            }

            Collections.sort(shortcuts);
            for (String name : shortcuts) {
                EmojiCheatSheet.EmojiShortcut shortcut = EmojiCheatSheet.shortCutMap.get(name);
                System.out.println(String.format("* :%s: %s", shortcut.name, name));
            }
        }

        System.out.println("\n\n");
    }

    //shortCutMap.put("bee", new EmojiShortcut("honeybee", "bee.png", null, "nature"));
    //shortCutMap.put("donut", new EmojiShortcut("doughnut", "donut.png", "https://assets-cdn.github.com/images/icons/emoji/unicode/1f369.png", "objects"));

    public static final String[] files = {
            "+1.png",
            "-1.png",
            "100.png",
            "1234.png",
            "8ball.png",
            "a.png",
            "ab.png",
            "abc.png",
            "abcd.png",
            "accept.png",
            "aerial_tramway.png",
            "airplane.png",
            "alarm_clock.png",
            "alien.png",
            "ambulance.png",
            "anchor.png",
            "angel.png",
            "anger.png",
            "angry.png",
            "anguished.png",
            "ant.png",
            "apple.png",
            "aquarius.png",
            "aries.png",
            "arrow_backward.png",
            "arrow_double_down.png",
            "arrow_double_up.png",
            "arrow_down.png",
            "arrow_down_small.png",
            "arrow_forward.png",
            "arrow_heading_down.png",
            "arrow_heading_up.png",
            "arrow_left.png",
            "arrow_lower_left.png",
            "arrow_lower_right.png",
            "arrow_right.png",
            "arrow_right_hook.png",
            "arrow_up.png",
            "arrow_up_down.png",
            "arrow_up_small.png",
            "arrow_upper_left.png",
            "arrow_upper_right.png",
            "arrows_clockwise.png",
            "arrows_counterclockwise.png",
            "art.png",
            "articulated_lorry.png",
            "astonished.png",
            "atm.png",
            "b.png",
            "baby.png",
            "baby_bottle.png",
            "baby_chick.png",
            "baby_symbol.png",
            "back.png",
            "baggage_claim.png",
            "balloon.png",
            "ballot_box_with_check.png",
            "bamboo.png",
            "banana.png",
            "bangbang.png",
            "bank.png",
            "bar_chart.png",
            "barber.png",
            "baseball.png",
            "basketball.png",
            "bath.png",
            "bathtub.png",
            "battery.png",
            "bear.png",
            "bee.png",
            "beer.png",
            "beers.png",
            "beetle.png",
            "beginner.png",
            "bell.png",
            "bento.png",
            "bicyclist.png",
            "bike.png",
            "bikini.png",
            "bird.png",
            "birthday.png",
            "black_circle.png",
            "black_joker.png",
            "black_medium_small_square.png",
            "black_medium_square.png",
            "black_nib.png",
            "black_small_square.png",
            "black_square.png",
            "black_square_button.png",
            "blossom.png",
            "blowfish.png",
            "blue_book.png",
            "blue_car.png",
            "blue_heart.png",
            "blush.png",
            "boar.png",
            "boat.png",
            "bomb.png",
            "book.png",
            "bookmark.png",
            "bookmark_tabs.png",
            "books.png",
            "boom.png",
            "boot.png",
            "bouquet.png",
            "bow.png",
            "bowling.png",
            "bowtie.png",
            "boy.png",
            "bread.png",
            "bride_with_veil.png",
            "bridge_at_night.png",
            "briefcase.png",
            "broken_heart.png",
            "bug.png",
            "bulb.png",
            "bullettrain_front.png",
            "bullettrain_side.png",
            "bus.png",
            "busstop.png",
            "bust_in_silhouette.png",
            "busts_in_silhouette.png",
            "cactus.png",
            "cake.png",
            "calendar.png",
            "calling.png",
            "camel.png",
            "camera.png",
            "cancer.png",
            "candy.png",
            "capital_abcd.png",
            "capricorn.png",
            "car.png",
            "card_index.png",
            "carousel_horse.png",
            "cat.png",
            "cat2.png",
            "cd.png",
            "chart.png",
            "chart_with_downwards_trend.png",
            "chart_with_upwards_trend.png",
            "checkered_flag.png",
            "cherries.png",
            "cherry_blossom.png",
            "chestnut.png",
            "chicken.png",
            "children_crossing.png",
            "chocolate_bar.png",
            "christmas_tree.png",
            "church.png",
            "cinema.png",
            "circus_tent.png",
            "city_sunrise.png",
            "city_sunset.png",
            "cl.png",
            "clap.png",
            "clapper.png",
            "clipboard.png",
            "clock1.png",
            "clock10.png",
            "clock1030.png",
            "clock11.png",
            "clock1130.png",
            "clock12.png",
            "clock1230.png",
            "clock130.png",
            "clock2.png",
            "clock230.png",
            "clock3.png",
            "clock330.png",
            "clock4.png",
            "clock430.png",
            "clock5.png",
            "clock530.png",
            "clock6.png",
            "clock630.png",
            "clock7.png",
            "clock730.png",
            "clock8.png",
            "clock830.png",
            "clock9.png",
            "clock930.png",
            "closed_book.png",
            "closed_lock_with_key.png",
            "closed_umbrella.png",
            "cloud.png",
            "clubs.png",
            "cn.png",
            "cocktail.png",
            "coffee.png",
            "cold_sweat.png",
            "collision.png",
            "computer.png",
            "confetti_ball.png",
            "confounded.png",
            "confused.png",
            "congratulations.png",
            "construction.png",
            "construction_worker.png",
            "convenience_store.png",
            "cookie.png",
            "cool.png",
            "cop.png",
            "copyright.png",
            "corn.png",
            "couple.png",
            "couple_with_heart.png",
            "couplekiss.png",
            "cow.png",
            "cow2.png",
            "credit_card.png",
            "crescent_moon.png",
            "crocodile.png",
            "crossed_flags.png",
            "crown.png",
            "cry.png",
            "crying_cat_face.png",
            "crystal_ball.png",
            "cupid.png",
            "curly_loop.png",
            "currency_exchange.png",
            "curry.png",
            "custard.png",
            "customs.png",
            "cyclone.png",
            "dancer.png",
            "dancers.png",
            "dango.png",
            "dart.png",
            "dash.png",
            "date.png",
            "de.png",
            "deciduous_tree.png",
            "department_store.png",
            "diamond_shape_with_a_dot_inside.png",
            "diamonds.png",
            "disappointed.png",
            "disappointed_relieved.png",
            "dizzy.png",
            "dizzy_face.png",
            "do_not_litter.png",
            "dog.png",
            "dog2.png",
            "dollar.png",
            "dolls.png",
            "dolphin.png",
            "donut.png",
            "door.png",
            "doughnut.png",
            "dragon.png",
            "dragon_face.png",
            "dress.png",
            "dromedary_camel.png",
            "droplet.png",
            "dvd.png",
            "e-mail.png",
            "ear.png",
            "ear_of_rice.png",
            "earth_africa.png",
            "earth_americas.png",
            "earth_asia.png",
            "egg.png",
            "eggplant.png",
            "eight.png",
            "eight_pointed_black_star.png",
            "eight_spoked_asterisk.png",
            "electric_plug.png",
            "elephant.png",
            "email.png",
            "end.png",
            "envelope.png",
            "es.png",
            "euro.png",
            "european_castle.png",
            "european_post_office.png",
            "evergreen_tree.png",
            "exclamation.png",
            "expressionless.png",
            "eyeglasses.png",
            "eyes.png",
            "facepunch.png",
            "factory.png",
            "fallen_leaf.png",
            "family.png",
            "fast_forward.png",
            "fax.png",
            "fearful.png",
            "feelsgood.png",
            "feet.png",
            "ferris_wheel.png",
            "file_folder.png",
            "finnadie.png",
            "fire.png",
            "fire_engine.png",
            "fireworks.png",
            "first_quarter_moon.png",
            "first_quarter_moon_with_face.png",
            "fish.png",
            "fish_cake.png",
            "fishing_pole_and_fish.png",
            "fist.png",
            "five.png",
            "flags.png",
            "flashlight.png",
            "floppy_disk.png",
            "flower_playing_cards.png",
            "flushed.png",
            "foggy.png",
            "football.png",
            "fork_and_knife.png",
            "fountain.png",
            "four.png",
            "four_leaf_clover.png",
            "fr.png",
            "free.png",
            "fried_shrimp.png",
            "fries.png",
            "frog.png",
            "frowning.png",
            "fu.png",
            "fuelpump.png",
            "full_moon.png",
            "full_moon_with_face.png",
            "game_die.png",
            "gb.png",
            "gem.png",
            "gemini.png",
            "ghost.png",
            "gift.png",
            "gift_heart.png",
            "girl.png",
            "globe_with_meridians.png",
            "goat.png",
            "goberserk.png",
            "godmode.png",
            "golf.png",
            "grapes.png",
            "green_apple.png",
            "green_book.png",
            "green_heart.png",
            "grey_exclamation.png",
            "grey_question.png",
            "grimacing.png",
            "grin.png",
            "grinning.png",
            "guardsman.png",
            "guitar.png",
            "gun.png",
            "haircut.png",
            "hamburger.png",
            "hammer.png",
            "hamster.png",
            "hand.png",
            "handbag.png",
            "hankey.png",
            "hash.png",
            "hatched_chick.png",
            "hatching_chick.png",
            "headphones.png",
            "hear_no_evil.png",
            "heart.png",
            "heart_decoration.png",
            "heart_eyes.png",
            "heart_eyes_cat.png",
            "heartbeat.png",
            "heartpulse.png",
            "hearts.png",
            "heavy_check_mark.png",
            "heavy_division_sign.png",
            "heavy_dollar_sign.png",
            "heavy_exclamation_mark.png",
            "heavy_minus_sign.png",
            "heavy_multiplication_x.png",
            "heavy_plus_sign.png",
            "helicopter.png",
            "herb.png",
            "hibiscus.png",
            "high_brightness.png",
            "high_heel.png",
            "hocho.png",
            "honey_pot.png",
            "honeybee.png",
            "horse.png",
            "horse_racing.png",
            "hospital.png",
            "hotel.png",
            "hotsprings.png",
            "hourglass.png",
            "hourglass_flowing_sand.png",
            "house.png",
            "house_with_garden.png",
            "hurtrealbad.png",
            "hushed.png",
            "ice_cream.png",
            "icecream.png",
            "id.png",
            "ideograph_advantage.png",
            "imp.png",
            "inbox_tray.png",
            "incoming_envelope.png",
            "information_desk_person.png",
            "information_source.png",
            "innocent.png",
            "interrobang.png",
            "iphone.png",
            "it.png",
            "izakaya_lantern.png",
            "jack_o_lantern.png",
            "japan.png",
            "japanese_castle.png",
            "japanese_goblin.png",
            "japanese_ogre.png",
            "jeans.png",
            "joy.png",
            "joy_cat.png",
            "jp.png",
            "key.png",
            "keycap_ten.png",
            "kimono.png",
            "kiss.png",
            "kissing.png",
            "kissing_cat.png",
            "kissing_closed_eyes.png",
            "kissing_face.png",
            "kissing_heart.png",
            "kissing_smiling_eyes.png",
            "koala.png",
            "koko.png",
            "kr.png",
            "large_blue_circle.png",
            "large_blue_diamond.png",
            "large_orange_diamond.png",
            "last_quarter_moon.png",
            "last_quarter_moon_with_face.png",
            "laughing.png",
            "leaves.png",
            "ledger.png",
            "left_luggage.png",
            "left_right_arrow.png",
            "leftwards_arrow_with_hook.png",
            "lemon.png",
            "leo.png",
            "leopard.png",
            "libra.png",
            "light_rail.png",
            "link.png",
            "lips.png",
            "lipstick.png",
            "lock.png",
            "lock_with_ink_pen.png",
            "lollipop.png",
            "loop.png",
            "loudspeaker.png",
            "love_hotel.png",
            "love_letter.png",
            "low_brightness.png",
            "m.png",
            "mag.png",
            "mag_right.png",
            "mahjong.png",
            "mailbox.png",
            "mailbox_closed.png",
            "mailbox_with_mail.png",
            "mailbox_with_no_mail.png",
            "man.png",
            "man_with_gua_pi_mao.png",
            "man_with_turban.png",
            "mans_shoe.png",
            "maple_leaf.png",
            "mask.png",
            "massage.png",
            "meat_on_bone.png",
            "mega.png",
            "melon.png",
            "memo.png",
            "mens.png",
            "metal.png",
            "metro.png",
            "microphone.png",
            "microscope.png",
            "milky_way.png",
            "minibus.png",
            "minidisc.png",
            "mobile_phone_off.png",
            "money_with_wings.png",
            "moneybag.png",
            "monkey.png",
            "monkey_face.png",
            "monorail.png",
            "mortar_board.png",
            "mount_fuji.png",
            "mountain_bicyclist.png",
            "mountain_cableway.png",
            "mountain_railway.png",
            "mouse.png",
            "mouse2.png",
            "movie_camera.png",
            "moyai.png",
            "muscle.png",
            "mushroom.png",
            "musical_keyboard.png",
            "musical_note.png",
            "musical_score.png",
            "mute.png",
            "nail_care.png",
            "name_badge.png",
            "neckbeard.png",
            "necktie.png",
            "negative_squared_cross_mark.png",
            "neutral_face.png",
            "new.png",
            "new_moon.png",
            "new_moon_with_face.png",
            "newspaper.png",
            "ng.png",
            "nine.png",
            "no_bell.png",
            "no_bicycles.png",
            "no_entry.png",
            "no_entry_sign.png",
            "no_good.png",
            "no_mobile_phones.png",
            "no_mouth.png",
            "no_pedestrians.png",
            "no_smoking.png",
            "non-potable_water.png",
            "nose.png",
            "notebook.png",
            "notebook_with_decorative_cover.png",
            "notes.png",
            "nut_and_bolt.png",
            "o.png",
            "o2.png",
            "ocean.png",
            "octocat.png",
            "octopus.png",
            "oden.png",
            "office.png",
            "ok.png",
            "ok_hand.png",
            "ok_woman.png",
            "older_man.png",
            "older_woman.png",
            "on.png",
            "oncoming_automobile.png",
            "oncoming_bus.png",
            "oncoming_police_car.png",
            "oncoming_taxi.png",
            "one.png",
            "open_file_folder.png",
            "open_hands.png",
            "open_mouth.png",
            "ophiuchus.png",
            "orange_book.png",
            "outbox_tray.png",
            "ox.png",
            "package.png",
            "page_facing_up.png",
            "page_with_curl.png",
            "pager.png",
            "palm_tree.png",
            "panda_face.png",
            "paperclip.png",
            "parking.png",
            "part_alternation_mark.png",
            "partly_sunny.png",
            "passport_control.png",
            "paw_prints.png",
            "peach.png",
            "pear.png",
            "pencil.png",
            "pencil2.png",
            "penguin.png",
            "pensive.png",
            "performing_arts.png",
            "persevere.png",
            "person_frowning.png",
            "person_with_blond_hair.png",
            "person_with_pouting_face.png",
            "phone.png",
            "pig.png",
            "pig2.png",
            "pig_nose.png",
            "pill.png",
            "pineapple.png",
            "pisces.png",
            "pizza.png",
            "plus1.png",
            "point_down.png",
            "point_left.png",
            "point_right.png",
            "point_up.png",
            "point_up_2.png",
            "police_car.png",
            "poodle.png",
            "poop.png",
            "post_office.png",
            "postal_horn.png",
            "postbox.png",
            "potable_water.png",
            "pouch.png",
            "poultry_leg.png",
            "pound.png",
            "pouting_cat.png",
            "pray.png",
            "princess.png",
            "punch.png",
            "purple_heart.png",
            "purse.png",
            "pushpin.png",
            "put_litter_in_its_place.png",
            "question.png",
            "rabbit.png",
            "rabbit2.png",
            "racehorse.png",
            "radio.png",
            "radio_button.png",
            "rage.png",
            "rage1.png",
            "rage2.png",
            "rage3.png",
            "rage4.png",
            "railway_car.png",
            "rainbow.png",
            "raised_hand.png",
            "raised_hands.png",
            "raising_hand.png",
            "ram.png",
            "ramen.png",
            "rat.png",
            "recycle.png",
            "red_car.png",
            "red_circle.png",
            "registered.png",
            "relaxed.png",
            "relieved.png",
            "repeat.png",
            "repeat_one.png",
            "restroom.png",
            "revolving_hearts.png",
            "rewind.png",
            "ribbon.png",
            "rice.png",
            "rice_ball.png",
            "rice_cracker.png",
            "rice_scene.png",
            "ring.png",
            "rocket.png",
            "roller_coaster.png",
            "rooster.png",
            "rose.png",
            "rotating_light.png",
            "round_pushpin.png",
            "rowboat.png",
            "ru.png",
            "rugby_football.png",
            "runner.png",
            "running.png",
            "running_shirt_with_sash.png",
            "sa.png",
            "sagittarius.png",
            "sailboat.png",
            "sake.png",
            "sandal.png",
            "santa.png",
            "satellite.png",
            "satisfied.png",
            "saxophone.png",
            "school.png",
            "school_satchel.png",
            "scissors.png",
            "scorpius.png",
            "scream.png",
            "scream_cat.png",
            "scroll.png",
            "seat.png",
            "secret.png",
            "see_no_evil.png",
            "seedling.png",
            "seven.png",
            "shaved_ice.png",
            "sheep.png",
            "shell.png",
            "ship.png",
            "shipit.png",
            "shirt.png",
            "shit.png",
            "shoe.png",
            "shower.png",
            "signal_strength.png",
            "simple_smile.png",
            "six.png",
            "six_pointed_star.png",
            "ski.png",
            "skull.png",
            "sleeping.png",
            "sleepy.png",
            "slot_machine.png",
            "small_blue_diamond.png",
            "small_orange_diamond.png",
            "small_red_triangle.png",
            "small_red_triangle_down.png",
            "smile.png",
            "smile_cat.png",
            "smiley.png",
            "smiley_cat.png",
            "smiling_imp.png",
            "smirk.png",
            "smirk_cat.png",
            "smoking.png",
            "snail.png",
            "snake.png",
            "snowboarder.png",
            "snowflake.png",
            "snowman.png",
            "sob.png",
            "soccer.png",
            "soon.png",
            "sos.png",
            "sound.png",
            "space_invader.png",
            "spades.png",
            "spaghetti.png",
            "sparkle.png",
            "sparkler.png",
            "sparkles.png",
            "sparkling_heart.png",
            "speak_no_evil.png",
            "speaker.png",
            "speech_balloon.png",
            "speedboat.png",
            "squirrel.png",
            "star.png",
            "star2.png",
            "stars.png",
            "station.png",
            "statue_of_liberty.png",
            "steam_locomotive.png",
            "stew.png",
            "straight_ruler.png",
            "strawberry.png",
            "stuck_out_tongue.png",
            "stuck_out_tongue_closed_eyes.png",
            "stuck_out_tongue_winking_eye.png",
            "sun_with_face.png",
            "sunflower.png",
            "sunglasses.png",
            "sunny.png",
            "sunrise.png",
            "sunrise_over_mountains.png",
            "surfer.png",
            "sushi.png",
            "suspect.png",
            "suspension_railway.png",
            "sweat.png",
            "sweat_drops.png",
            "sweat_smile.png",
            "sweet_potato.png",
            "swimmer.png",
            "symbols.png",
            "syringe.png",
            "tada.png",
            "tanabata_tree.png",
            "tangerine.png",
            "taurus.png",
            "taxi.png",
            "tea.png",
            "telephone.png",
            "telephone_receiver.png",
            "telescope.png",
            "tennis.png",
            "tent.png",
            "thought_balloon.png",
            "three.png",
            "thumbsdown.png",
            "thumbsup.png",
            "ticket.png",
            "tiger.png",
            "tiger2.png",
            "tired_face.png",
            "tm.png",
            "toilet.png",
            "tokyo_tower.png",
            "tomato.png",
            "tongue.png",
            "top.png",
            "tophat.png",
            "tractor.png",
            "traffic_light.png",
            "train.png",
            "train2.png",
            "tram.png",
            "triangular_flag_on_post.png",
            "triangular_ruler.png",
            "trident.png",
            "triumph.png",
            "trolleybus.png",
            "trollface.png",
            "trophy.png",
            "tropical_drink.png",
            "tropical_fish.png",
            "truck.png",
            "trumpet.png",
            "tshirt.png",
            "tulip.png",
            "turtle.png",
            "tv.png",
            "twisted_rightwards_arrows.png",
            "two.png",
            "two_hearts.png",
            "two_men_holding_hands.png",
            "two_women_holding_hands.png",
            "u5272.png",
            "u5408.png",
            "u55b6.png",
            "u6307.png",
            "u6708.png",
            "u6709.png",
            "u6e80.png",
            "u7121.png",
            "u7533.png",
            "u7981.png",
            "u7a7a.png",
            "uk.png",
            "umbrella.png",
            "unamused.png",
            "underage.png",
            "unlock.png",
            "up.png",
            "us.png",
            "v.png",
            "vertical_traffic_light.png",
            "vhs.png",
            "vibration_mode.png",
            "video_camera.png",
            "video_game.png",
            "violin.png",
            "virgo.png",
            "volcano.png",
            "vs.png",
            "walking.png",
            "waning_crescent_moon.png",
            "waning_gibbous_moon.png",
            "warning.png",
            "watch.png",
            "water_buffalo.png",
            "watermelon.png",
            "wave.png",
            "wavy_dash.png",
            "waxing_crescent_moon.png",
            "waxing_gibbous_moon.png",
            "wc.png",
            "weary.png",
            "wedding.png",
            "whale.png",
            "whale2.png",
            "wheelchair.png",
            "white_check_mark.png",
            "white_circle.png",
            "white_flower.png",
            "white_large_square.png",
            "white_medium_small_square.png",
            "white_medium_square.png",
            "white_small_square.png",
            "white_square_button.png",
            "wind_chime.png",
            "wine_glass.png",
            "wink.png",
            "wolf.png",
            "woman.png",
            "womans_clothes.png",
            "womans_hat.png",
            "womens.png",
            "worried.png",
            "wrench.png",
            "x.png",
            "yellow_heart.png",
            "yen.png",
            "yum.png",
            "zap.png",
            "zero.png",
            "zzz.png",
    };
}
