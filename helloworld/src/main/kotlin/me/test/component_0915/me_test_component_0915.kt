package me.test.component_0915

import com.fasterxml.jackson.`annotation`.JsonIgnore
import com.fasterxml.jackson.databind.node.ObjectNode
import io.opencui.core.*
import io.opencui.core.da.CompositeDialogAct
import io.opencui.du.BertStateTracker
import io.opencui.du.DUMeta
import io.opencui.du.DUSlotMeta
import io.opencui.du.EntityType
import io.opencui.du.LangPack
import io.opencui.du.StateTracker
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.MutableList
import kotlin.reflect.KClass

public data class Agent(
  public val user: String?
) : IChatbot() {
  public override val duMeta: DUMeta
    public get() = Agent.duMeta

  public override val stateTracker: StateTracker
    public get() = Agent.stateTracker

  public override val rewriteRules: MutableList<KClass<out CompositeDialogAct>> = mutableListOf()

  public override val routing: Map<String, RoutingInfo> = mapOf()

  public constructor() : this("")

  public companion object {
    public val duMeta: DUMeta = loadDUMetaDsl(en, Agent::class.java.classLoader, "me.test",
        "component_0915", "en", "master", "271", "Asia/Shanghai")

    public val stateTracker: StateTracker = BertStateTracker(duMeta)
  }
}

public object en : LangPack {
  public override val frames: List<ObjectNode> = listOf()

  public override val entityTypes: Map<String, EntityType> = mapOf("kotlin.Int" to
      entityType("kotlin.Int") {
        children(listOf())
        recognizer("DucklingRecognizer")
      }
      ,
      "kotlin.Float" to entityType("kotlin.Float") {
        children(listOf())
        recognizer("DucklingRecognizer")
      }
      ,
      "kotlin.String" to entityType("kotlin.String") {
        children(listOf())
      }
      ,
      "kotlin.Boolean" to entityType("kotlin.Boolean") {
        children(listOf())
        recognizer("ListRecognizer")
        entity("true","Yes","True","Yeap")
        entity("false","No","False","Nope")
      }
      ,
      "kotlin.Unit" to entityType("kotlin.Unit") {
        children(listOf())
      }
      ,
      "java.time.LocalDateTime" to entityType("java.time.LocalDateTime") {
        children(listOf())
        recognizer("DucklingRecognizer")
      }
      ,
      "java.time.Year" to entityType("java.time.Year") {
        children(listOf())
        recognizer("DucklingRecognizer")
      }
      ,
      "java.time.YearMonth" to entityType("java.time.YearMonth") {
        children(listOf())
        recognizer("DucklingRecognizer")
      }
      ,
      "java.time.LocalDate" to entityType("java.time.LocalDate") {
        children(listOf())
        recognizer("DucklingRecognizer")
      }
      ,
      "java.time.LocalTime" to entityType("java.time.LocalTime") {
        children(listOf())
        recognizer("DucklingRecognizer")
      }
      ,
      "java.time.DayOfWeek" to entityType("java.time.DayOfWeek") {
        children(listOf())
        recognizer("ListRecognizer")
        entity("1","Mon.","Monday")
        entity("2","Tue.","Tuesday")
        entity("3","Wed.","Wednesday")
        entity("4","Thu.","Thursday")
        entity("5","Fri.","Friday")
        entity("6","Sat.","Saturday ")
        entity("7","Sun.","Sunday")
      }
      ,
      "java.time.ZoneId" to entityType("java.time.ZoneId") {
        children(listOf())
        recognizer("ListRecognizer")
        entity("Antarctica/Troll")
        entity("Asia/Phnom_Penh")
        entity("Atlantic/Faeroe")
        entity("Atlantic/St_Helena")
        entity("Etc/GMT-3")
        entity("Europe/Copenhagen")
        entity("America/St_Kitts")
        entity("America/St_Thomas")
        entity("Pacific/Efate")
        entity("Asia/Almaty")
        entity("Asia/Kolkata")
        entity("Brazil/West")
        entity("Africa/Nairobi")
        entity("America/Indiana/Knox")
        entity("America/Resolute")
        entity("EST5EDT")
        entity("Pacific/Johnston")
        entity("America/Campo_Grande")
        entity("America/Danmarkshavn")
        entity("America/Sao_Paulo")
        entity("America/Swift_Current")
        entity("Antarctica/Macquarie")
        entity("Antarctica/McMurdo")
        entity("Israel")
        entity("US/Pacific-New")
        entity("America/Grenada")
        entity("America/Merida")
        entity("Antarctica/Palmer")
        entity("Pacific/Chatham")
        entity("America/Fort_Wayne")
        entity("America/Santo_Domingo")
        entity("Europe/Andorra")
        entity("Europe/Tiraspol")
        entity("America/Catamarca")
        entity("America/Scoresbysund")
        entity("Europe/Kirov")
        entity("Europe/Lisbon")
        entity("Europe/Oslo")
        entity("Africa/Casablanca")
        entity("Africa/Ouagadougou")
        entity("Asia/Dubai")
        entity("Asia/Vladivostok")
        entity("Etc/GMT-8")
        entity("Europe/Berlin")
        entity("Pacific/Yap")
        entity("America/Indiana/Tell_City")
        entity("Asia/Brunei")
        entity("America/Vancouver")
        entity("Asia/Jakarta")
        entity("Asia/Kashgar")
        entity("Asia/Tokyo")
        entity("Brazil/Acre")
        entity("Europe/Tallinn")
        entity("America/Curacao")
        entity("America/North_Dakota/New_Salem")
        entity("Etc/Greenwich")
        entity("Europe/Simferopol")
        entity("Mexico/General")
        entity("Pacific/Tongatapu")
        entity("America/Goose_Bay")
        entity("Australia/Lord_Howe")
        entity("US/Michigan")
        entity("Etc/GMT-14")
        entity("Europe/Luxembourg")
        entity("Asia/Aden")
        entity("Asia/Anadyr")
        entity("Asia/Srednekolymsk")
        entity("Etc/GMT0")
        entity("NZ-CHAT")
        entity("America/Rainy_River")
        entity("America/Virgin")
        entity("Asia/Dhaka")
        entity("Asia/Qyzylorda")
        entity("Chile/EasterIsland")
        entity("Europe/Madrid")
        entity("PST8PDT")
        entity("America/Argentina/San_Luis")
        entity("America/Metlakatla")
        entity("Africa/Bissau")
        entity("America/Indiana/Winamac")
        entity("Europe/Isle_of_Man")
        entity("Europe/Istanbul")
        entity("GMT0")
        entity("Africa/Addis_Ababa")
        entity("Africa/Asmara")
        entity("America/Fortaleza")
        entity("America/St_Lucia")
        entity("Canada/Central")
        entity("Etc/GMT+10")
        entity("Africa/Nouakchott")
        entity("America/Argentina/Salta")
        entity("America/Mendoza")
        entity("Europe/Dublin")
        entity("Europe/London")
        entity("SystemV/AST4ADT")
        entity("Africa/El_Aaiun")
        entity("Africa/Kinshasa")
        entity("Asia/Harbin")
        entity("Asia/Samarkand")
        entity("Europe/Saratov")
        entity("Pacific/Chuuk")
        entity("PRC")
        entity("Africa/Accra")
        entity("America/Detroit")
        entity("America/Porto_Velho")
        entity("Europe/Guernsey")
        entity("Europe/Ulyanovsk")
        entity("Iran")
        entity("Antarctica/Rothera")
        entity("Asia/Vientiane")
        entity("Asia/Qatar")
        entity("Africa/Freetown")
        entity("Asia/Karachi")
        entity("America/Yakutat")
        entity("Asia/Nicosia")
        entity("NZ")
        entity("ROK")
        entity("America/Mazatlan")
        entity("America/Santa_Isabel")
        entity("Asia/Magadan")
        entity("Europe/Minsk")
        entity("Europe/Prague")
        entity("Pacific/Tarawa")
        entity("US/Alaska")
        entity("America/Buenos_Aires")
        entity("America/Ojinaga")
        entity("Asia/Kuching")
        entity("Asia/Macao")
        entity("Asia/Sakhalin")
        entity("Australia/Queensland")
        entity("Canada/Eastern")
        entity("Europe/Gibraltar")
        entity("Africa/Bujumbura")
        entity("Asia/Aqtau")
        entity("Europe/Mariehamn")
        entity("Asia/Shanghai")
        entity("Atlantic/Bermuda")
        entity("Asia/Irkutsk")
        entity("Etc/UTC")
        entity("America/Argentina/Tucuman")
        entity("Asia/Hebron")
        entity("Asia/Bishkek")
        entity("Asia/Kuwait")
        entity("Europe/Jersey")
        entity("Navajo")
        entity("America/Cayman")
        entity("America/Monterrey")
        entity("America/Nassau")
        entity("Europe/Belfast")
        entity("America/Tortola")
        entity("Brazil/DeNoronha")
        entity("Kwajalein")
        entity("Pacific/Auckland")
        entity("Africa/Ceuta")
        entity("America/Chicago")
        entity("Australia/Sydney")
        entity("Europe/Budapest")
        entity("SystemV/YST9")
        entity("US/Pacific")
        entity("Africa/Khartoum")
        entity("America/Godthab")
        entity("Chile/Continental")
        entity("Europe/Vienna")
        entity("Asia/Baku")
        entity("Asia/Tomsk")
        entity("Australia/Melbourne")
        entity("Pacific/Fakaofo")
        entity("Africa/Harare")
        entity("America/North_Dakota/Beulah")
        entity("America/Argentina/Catamarca")
        entity("Turkey")
        entity("Asia/Istanbul")
        entity("Europe/Bratislava")
        entity("Pacific/Kwajalein")
        entity("Pacific/Rarotonga")
        entity("Africa/Tripoli")
        entity("America/Port_of_Spain")
        entity("America/Creston")
        entity("Asia/Gaza")
        entity("Australia/West")
        entity("Pacific/Niue")
        entity("America/Matamoros")
        entity("Asia/Kuala_Lumpur")
        entity("Asia/Tashkent")
        entity("Asia/Ust-Nera")
        entity("Australia/Broken_Hill")
        entity("Europe/Astrakhan")
        entity("Africa/Lome")
        entity("America/Dawson_Creek")
        entity("Eire")
        entity("Etc/GMT-6")
        entity("SystemV/PST8PDT")
        entity("Africa/Niamey")
        entity("America/Dominica")
        entity("Pacific/Samoa")
        entity("Pacific/Truk")
        entity("Asia/Yekaterinburg")
        entity("Etc/GMT+0")
        entity("America/Thule")
        entity("Asia/Ujung_Pandang")
        entity("Etc/GMT+9")
        entity("America/Knox_IN")
        entity("America/Louisville")
        entity("Europe/Paris")
        entity("Europe/San_Marino")
        entity("America/Barbados")
        entity("Australia/Eucla")
        entity("Etc/GMT-11")
        entity("America/Miquelon")
        entity("America/Recife")
        entity("Europe/Sarajevo")
        entity("Atlantic/Azores")
        entity("Europe/Samara")
        entity("Asia/Beirut")
        entity("Asia/Chita")
        entity("Asia/Hovd")
        entity("US/Indiana-Starke")
        entity("Africa/Brazzaville")
        entity("Asia/Aqtobe")
        entity("America/Nuuk")
        entity("Etc/GMT")
        entity("Asia/Chungking")
        entity("Europe/Skopje")
        entity("Africa/Dar_es_Salaam")
        entity("Asia/Barnaul")
        entity("Australia/Darwin")
        entity("Africa/Lagos")
        entity("Asia/Ulaanbaatar")
        entity("Cuba")
        entity("Europe/Rome")
        entity("Asia/Baghdad")
        entity("Asia/Tel_Aviv")
        entity("America/Argentina/Mendoza")
        entity("Europe/Riga")
        entity("Africa/Djibouti")
        entity("America/Anchorage")
        entity("Asia/Tehran")
        entity("Australia/North")
        entity("Etc/GMT-2")
        entity("Etc/GMT-4")
        entity("Europe/Bucharest")
        entity("Europe/Tirane")
        entity("America/Argentina/Buenos_Aires")
        entity("America/Chihuahua")
        entity("Pacific/Pitcairn")
        entity("Canada/Yukon")
        entity("Etc/GMT-13")
        entity("Pacific/Gambier")
        entity("SystemV/AST4")
        entity("America/Noronha")
        entity("Brazil/East")
        entity("Africa/Windhoek")
        entity("Asia/Damascus")
        entity("Asia/Pyongyang")
        entity("Pacific/Tahiti")
        entity("US/Eastern")
        entity("Africa/Algiers")
        entity("Africa/Malabo")
        entity("SystemV/YST9YDT")
        entity("US/Arizona")
        entity("Canada/Newfoundland")
        entity("Egypt")
        entity("Etc/GMT+12")
        entity("Pacific/Saipan")
        entity("America/Atikokan")
        entity("Asia/Thimphu")
        entity("Etc/UCT")
        entity("America/Indiana/Vevay")
        entity("Asia/Dacca")
        entity("Iceland")
        entity("Africa/Ndjamena")
        entity("Atlantic/Faroe")
        entity("America/Denver")
        entity("America/Indiana/Petersburg")
        entity("Etc/GMT+8")
        entity("US/Mountain")
        entity("America/Belize")
        entity("America/Coral_Harbour")
        entity("Asia/Qostanay")
        entity("Europe/Athens")
        entity("Europe/Ljubljana")
        entity("Asia/Amman")
        entity("Asia/Jerusalem")
        entity("Etc/GMT-7")
        entity("America/Ensenada")
        entity("Asia/Makassar")
        entity("Etc/GMT-12")
        entity("Europe/Kiev")
        entity("GB")
        entity("Pacific/Guam")
        entity("Pacific/Norfolk")
        entity("Africa/Douala")
        entity("America/La_Paz")
        entity("Atlantic/Jan_Mayen")
        entity("Indian/Mauritius")
        entity("Africa/Johannesburg")
        entity("Africa/Mbabane")
        entity("America/Nome")
        entity("Pacific/Wake")
        entity("Zulu")
        entity("America/Montevideo")
        entity("Pacific/Guadalcanal")
        entity("Asia/Choibalsan")
        entity("Asia/Taipei")
        entity("Europe/Amsterdam")
        entity("Japan")
        entity("America/Havana")
        entity("Antarctica/South_Pole")
        entity("Europe/Warsaw")
        entity("Pacific/Midway")
        entity("America/Tegucigalpa")
        entity("Europe/Volgograd")
        entity("Asia/Yangon")
        entity("Canada/Saskatchewan")
        entity("Europe/Zurich")
        entity("Jamaica")
        entity("Singapore")
        entity("America/El_Salvador")
        entity("Antarctica/DumontDUrville")
        entity("Atlantic/Cape_Verde")
        entity("Africa/Luanda")
        entity("America/Whitehorse")
        entity("Pacific/Pohnpei")
        entity("Poland")
        entity("America/Indiana/Indianapolis")
        entity("Asia/Bangkok")
        entity("America/Panama")
        entity("America/Jamaica")
        entity("America/Managua")
        entity("America/Santiago")
        entity("America/Thunder_Bay")
        entity("Etc/GMT-1")
        entity("Africa/Cairo")
        entity("America/Anguilla")
        entity("Etc/GMT+4")
        entity("Mexico/BajaNorte")
        entity("America/Inuvik")
        entity("Asia/Krasnoyarsk")
        entity("Pacific/Fiji")
        entity("Europe/Zaporozhye")
        entity("US/Central")
        entity("America/Caracas")
        entity("America/Costa_Rica")
        entity("America/Phoenix")
        entity("Australia/Canberra")
        entity("Etc/GMT+6")
        entity("America/Guayaquil")
        entity("America/Indiana/Marengo")
        entity("Africa/Kampala")
        entity("Africa/Sao_Tome")
        entity("America/Bogota")
        entity("America/Lower_Princes")
        entity("America/New_York")
        entity("Asia/Saigon")
        entity("Africa/Bamako")
        entity("Africa/Gaborone")
        entity("Australia/Currie")
        entity("Pacific/Noumea")
        entity("Asia/Hong_Kong")
        entity("Asia/Macau")
        entity("Asia/Ulan_Bator")
        entity("Australia/Tasmania")
        entity("Indian/Christmas")
        entity("Pacific/Ponape")
        entity("Africa/Lubumbashi")
        entity("America/Rio_Branco")
        entity("Europe/Moscow")
        entity("Indian/Antananarivo")
        entity("SystemV/PST8")
        entity("Africa/Bangui")
        entity("America/Atka")
        entity("America/Porto_Acre")
        entity("America/Regina")
        entity("Asia/Manila")
        entity("Asia/Novokuznetsk")
        entity("CST6CDT")
        entity("America/Kentucky/Louisville")
        entity("America/Menominee")
        entity("Africa/Abidjan")
        entity("Europe/Zagreb")
        entity("America/Rankin_Inlet")
        entity("America/Sitka")
        entity("Africa/Maputo")
        entity("America/Lima")
        entity("Australia/Victoria")
        entity("Australia/Yancowinna")
        entity("Indian/Mahe")
        entity("Africa/Maseru")
        entity("America/St_Johns")
        entity("America/Dawson")
        entity("Asia/Ashkhabad")
        entity("Asia/Famagusta")
        entity("Europe/Vatican")
        entity("Libya")
        entity("Africa/Banjul")
        entity("America/Cordoba")
        entity("SystemV/EST5")
        entity("Europe/Stockholm")
        entity("America/Cuiaba")
        entity("America/Glace_Bay")
        entity("America/Puerto_Rico")
        entity("America/Grand_Turk")
        entity("America/Manaus")
        entity("Australia/Brisbane")
        entity("Europe/Brussels")
        entity("Pacific/Port_Moresby")
        entity("America/Belem")
        entity("Atlantic/Stanley")
        entity("Pacific/Kiritimati")
        entity("SystemV/CST6")
        entity("Canada/Pacific")
        entity("Europe/Monaco")
        entity("Etc/Zulu")
        entity("Canada/Mountain")
        entity("Etc/Universal")
        entity("Asia/Dushanbe")
        entity("Etc/GMT+1")
        entity("Pacific/Palau")
        entity("Asia/Atyrau")
        entity("Europe/Nicosia")
        entity("Asia/Urumqi")
        entity("Atlantic/Madeira")
        entity("Europe/Vaduz")
        entity("SystemV/EST5EDT")
        entity("America/Argentina/Jujuy")
        entity("Asia/Kathmandu")
        entity("Indian/Comoro")
        entity("America/St_Barthelemy")
        entity("Asia/Dili")
        entity("Atlantic/Canary")
        entity("Australia/Hobart")
        entity("Etc/GMT-10")
        entity("MET")
        entity("US/East-Indiana")
        entity("Africa/Porto-Novo")
        entity("Asia/Oral")
        entity("Pacific/Majuro")
        entity("Antarctica/Syowa")
        entity("Asia/Calcutta")
        entity("Asia/Yakutsk")
        entity("Canada/Atlantic")
        entity("Europe/Uzhgorod")
        entity("Greenwich")
        entity("Pacific/Apia")
        entity("Pacific/Honolulu")
        entity("America/Boa_Vista")
        entity("America/Hermosillo")
        entity("UTC")
        entity("America/Argentina/Ushuaia")
        entity("America/Kralendijk")
        entity("Indian/Maldives")
        entity("Asia/Ho_Chi_Minh")
        entity("Atlantic/Reykjavik")
        entity("America/Guadeloupe")
        entity("America/Iqaluit")
        entity("America/Mexico_City")
        entity("America/Toronto")
        entity("Asia/Colombo")
        entity("Asia/Singapore")
        entity("America/Argentina/San_Juan")
        entity("America/Bahia")
        entity("Hongkong")
        entity("America/Rosario")
        entity("America/Shiprock")
        entity("America/Halifax")
        entity("America/Moncton")
        entity("Antarctica/Mawson")
        entity("Australia/South")
        entity("America/Edmonton")
        entity("America/Jujuy")
        entity("Europe/Vilnius")
        entity("Indian/Cocos")
        entity("Pacific/Wallis")
        entity("UCT")
        entity("America/Antigua")
        entity("Asia/Thimbu")
        entity("Europe/Helsinki")
        entity("Africa/Dakar")
        entity("Etc/GMT+5")
        entity("Asia/Katmandu")
        entity("Europe/Busingen")
        entity("Europe/Malta")
        entity("Europe/Sofia")
        entity("America/Boise")
        entity("Arctic/Longyearbyen")
        entity("Asia/Khandyga")
        entity("Asia/Seoul")
        entity("GB-Eire")
        entity("WET")
        entity("America/Argentina/Cordoba")
        entity("America/Paramaribo")
        entity("Australia/LHI")
        entity("America/Los_Angeles")
        entity("Europe/Belgrade")
        entity("SystemV/HST10")
        entity("US/Hawaii")
        entity("America/Cayenne")
        entity("America/Guyana")
        entity("Asia/Muscat")
        entity("Asia/Tbilisi")
        entity("Africa/Kigali")
        entity("America/Guatemala")
        entity("Asia/Novosibirsk")
        entity("Europe/Podgorica")
        entity("Pacific/Easter")
        entity("Africa/Libreville")
        entity("Africa/Mogadishu")
        entity("Asia/Omsk")
        entity("Portugal")
        entity("SystemV/MST7MDT")
        entity("Africa/Juba")
        entity("America/Argentina/La_Rioja")
        entity("America/Yellowknife")
        entity("Asia/Jayapura")
        entity("Etc/GMT-9")
        entity("MST7MDT")
        entity("Pacific/Nauru")
        entity("US/Samoa")
        entity("America/Bahia_Banderas")
        entity("America/Juneau")
        entity("Indian/Reunion")
        entity("Pacific/Bougainville")
        entity("SystemV/CST6CDT")
        entity("Africa/Lusaka")
        entity("Etc/GMT-5")
        entity("America/Eirunepe")
        entity("Asia/Rangoon")
        entity("Etc/GMT-0")
        entity("Etc/GMT+7")
        entity("Universal")
        entity("US/Aleutian")
        entity("Africa/Blantyre")
        entity("America/Argentina/Rio_Gallegos")
        entity("Atlantic/South_Georgia")
        entity("Australia/Lindeman")
        entity("America/Indianapolis")
        entity("Asia/Pontianak")
        entity("Europe/Chisinau")
        entity("Indian/Mayotte")
        entity("Mexico/BajaSur")
        entity("Pacific/Funafuti")
        entity("Pacific/Kosrae")
        entity("America/Maceio")
        entity("Etc/GMT+2")
        entity("Antarctica/Casey")
        entity("Antarctica/Vostok")
        entity("Asia/Bahrain")
        entity("Indian/Kerguelen")
        entity("Pacific/Galapagos")
        entity("America/Argentina/ComodRivadavia")
        entity("America/Indiana/Vincennes")
        entity("Europe/Kaliningrad")
        entity("Africa/Monrovia")
        entity("America/Cambridge_Bay")
        entity("SystemV/MST7")
        entity("America/Araguaina")
        entity("Asia/Ashgabat")
        entity("Australia/Perth")
        entity("CET")
        entity("EET")
        entity("Etc/GMT+3")
        entity("Pacific/Enderbury")
        entity("W-SU")
        entity("America/Cancun")
        entity("America/North_Dakota/Center")
        entity("Pacific/Pago_Pago")
        entity("Africa/Tunis")
        entity("Australia/Adelaide")
        entity("America/St_Vincent")
        entity("Africa/Conakry")
        entity("America/Montserrat")
        entity("America/Martinique")
        entity("America/Nipigon")
        entity("America/Pangnirtung")
        entity("America/Winnipeg")
        entity("Etc/GMT+11")
        entity("America/Fort_Nelson")
        entity("America/Marigot")
        entity("America/Punta_Arenas")
        entity("Asia/Chongqing")
        entity("Asia/Riyadh")
        entity("Asia/Yerevan")
        entity("Africa/Timbuktu")
        entity("America/Blanc-Sablon")
        entity("America/Montreal")
        entity("America/Santarem")
        entity("Asia/Kabul")
        entity("Asia/Kamchatka")
        entity("Australia/ACT")
        entity("GMT")
        entity("America/Asuncion")
        entity("America/Kentucky/Monticello")
        entity("Indian/Chagos")
        entity("America/Port-au-Prince")
        entity("Pacific/Marquesas")
        entity("America/Adak")
        entity("America/Aruba")
        entity("Antarctica/Davis")
        entity("Australia/NSW")
        entity("Africa/Asmera")
        entity("America/Tijuana")
      }
      ,
      "kotlin.Any" to entityType("kotlin.Any") {
        children(listOf())
      }
      )

  public override val frameSlotMetas: Map<String, List<DUSlotMeta>> = mapOf("kotlin.Pair" to listOf(
      ),
      )

  public override val typeAlias: Map<String, List<String>> = mapOf()
}

public interface IComponent_0915 : IService {
  @JsonIgnore
  public fun testFunction(str: String): String?
}

// The first native implementation.
data class HelloWorldProvider(
  val config: Configuration,
  override var session: UserSession? = null): IComponent_0915, IProvider {

  override fun testFunction(str: String): String? {
    return "hello ${config["name"]}, $str"
  }

  companion object: ExtensionBuilder<IComponent_0915> {
    override fun invoke(config: Configuration): IComponent_0915 {
      return HelloWorldProvider(config)
    }
  }
}